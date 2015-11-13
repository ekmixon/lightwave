/*
 * Copyright © 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the “License”); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS, without
 * warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

using System;
using AppKit;
using Foundation;
using VmIdentity.UI.Common.Utilities;

namespace VmIdentity.UI.Common
{
    public partial class LoginWindowController : AppKit.NSWindowController
    {
        public String UserName{ get; set; }

        public String Password { get; set; }

        public String DomainName { get; set; }

        public String Server { get; set; }

        public String Upn { get; set; }

        #region Constructors

        // Called when created from unmanaged code
        public LoginWindowController (IntPtr handle) : base (handle)
        {
        }

        // Called when created directly from a XIB file
        [Export ("initWithCoder:")]
        public LoginWindowController (NSCoder coder) : base (coder)
        {
        }

        // Call to load from the XIB/NIB file
        public LoginWindowController () : base ("LoginWindow")
        {
        }

        // Call to load from the XIB/NIB file
        public LoginWindowController (String server) : base ("LoginWindow")
        {
            this.Server = server;
        }

        #endregion

        public override void AwakeFromNib ()
        {
            base.AwakeFromNib ();
            if (!string.IsNullOrWhiteSpace (Server))
                this.ServerTxtField.StringValue = Server;

            //Events
            this.OKButton.Activated += OnClickOKButton;
            this.CancelButton.Activated += OnClickCancelButton;

        }

        public void OnClickOKButton (object sender, EventArgs e)
        {
            if (string.IsNullOrWhiteSpace (UserNameTxtField.StringValue) || string.IsNullOrWhiteSpace (PasswordTxtField.StringValue) || string.IsNullOrWhiteSpace (ServerTxtField.StringValue)) {
                UIErrorHelper.ShowAlert ("", "Please enter values in the username and password");
            } else {
                Upn = UserNameTxtField.StringValue;
                String[] userAndDomain = Upn.Split ('@');
                if (userAndDomain.Length != 2) {
                    UIErrorHelper.ShowAlert ("", "Enter Valid User Principal Name");
                } else {
                    UserName = userAndDomain [0];
                    DomainName = userAndDomain [1];
                    Password = PasswordTxtField.StringValue;
                    Server = ServerTxtField.StringValue;

                    this.Close ();
                    NSApplication.SharedApplication.StopModalWithCode (1);
                }
            }
        }

        public void OnClickCancelButton (object sender, EventArgs e)
        {
            NSApplication.SharedApplication.StopModalWithCode (1);
            this.Close ();
        }

        //strongly typed window accessor
        public new LoginWindow Window {
            get {
                return (LoginWindow)base.Window;
            }
        }
    }
}

