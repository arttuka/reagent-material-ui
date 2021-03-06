(ns reagent-material-ui.icons.app-registration-rounded
  "Imports @material-ui/icons/AppRegistrationRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def app-registration-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "6", "r" "2", "cx" "12"}) (e "circle" #js {"cy" "18", "r" "2", "cx" "6"}) (e "circle" #js {"cy" "12", "r" "2", "cx" "6"}) (e "circle" #js {"cy" "6", "r" "2", "cx" "6"}) (e "circle" #js {"cy" "6", "r" "2", "cx" "18"}) (e "path" #js {"d" "M11 18.07v1.43c0 .28.22.5.5.5h1.4c.13 0 .26-.05.35-.15l5.83-5.83-2.12-2.12-5.81 5.81c-.1.1-.15.23-.15.36zM12.03 14L14 12.03V12c0-1.1-.9-2-2-2s-2 .9-2 2 .9 2 2 2h.03zm8.82-2.44l-1.41-1.41c-.2-.2-.51-.2-.71 0l-1.06 1.06 2.12 2.12 1.06-1.06c.2-.2.2-.51 0-.71z"}))
                                               "AppRegistrationRounded"))
