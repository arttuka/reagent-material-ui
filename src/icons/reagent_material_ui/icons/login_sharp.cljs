(ns reagent-material-ui.icons.login-sharp
  "Imports @material-ui/icons/LoginSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def login-sharp (create-svg-icon (e "path" #js {"d" "M11 7 9.6 8.4l2.6 2.6H2v2h10.2l-2.6 2.6L11 17l5-5-5-5zm9 12h-8v2h10V3H12v2h8v14z"})
                                  "LoginSharp"))
