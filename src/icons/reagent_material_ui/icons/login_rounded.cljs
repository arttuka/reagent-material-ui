(ns reagent-material-ui.icons.login-rounded
  "Imports @material-ui/icons/LoginRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def login-rounded (create-svg-icon (e "path" #js {"d" "M10.3 7.7c-.39.39-.39 1.01 0 1.4l1.9 1.9H3c-.55 0-1 .45-1 1s.45 1 1 1h9.2l-1.9 1.9c-.39.39-.39 1.01 0 1.4.39.39 1.01.39 1.4 0l3.59-3.59c.39-.39.39-1.02 0-1.41L11.7 7.7a.9839.9839 0 0 0-1.4 0zM20 19h-7c-.55 0-1 .45-1 1s.45 1 1 1h7c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2h-7c-.55 0-1 .45-1 1s.45 1 1 1h7v14z"})
                                    "LoginRounded"))
