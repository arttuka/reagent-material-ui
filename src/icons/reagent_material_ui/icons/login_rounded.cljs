(ns reagent-material-ui.icons.login-rounded
  "Imports @material-ui/icons/LoginRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def login-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 3h-6c-.55 0-1 .45-1 1s.45 1 1 1h6v14h-6c-.55 0-1 .45-1 1s.45 1 1 1h6c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"}) (e "path" #js {"d" "M11 9.21V11H4c-.55 0-1 .45-1 1s.45 1 1 1h7v1.79c0 .45.54.67.85.35l2.79-2.79c.2-.2.2-.51 0-.71l-2.79-2.79c-.31-.31-.85-.09-.85.36z"}))
                                    "LoginRounded"))
