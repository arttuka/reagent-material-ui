(ns reagent-mui.icons.app-registration-rounded
  "Imports @mui/icons-material/AppRegistrationRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def app-registration-rounded (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "6", "r" "2"}) (e "circle" #js {"cx" "6", "cy" "18", "r" "2"}) (e "circle" #js {"cx" "6", "cy" "12", "r" "2"}) (e "circle" #js {"cx" "6", "cy" "6", "r" "2"}) (e "circle" #js {"cx" "18", "cy" "6", "r" "2"}) (e "path" #js {"d" "M11 18.07v1.43c0 .28.22.5.5.5h1.4c.13 0 .26-.05.35-.15l5.83-5.83-2.12-2.12-5.81 5.81c-.1.1-.15.23-.15.36zM12.03 14 14 12.03V12c0-1.1-.9-2-2-2s-2 .9-2 2 .9 2 2 2h.03zm8.82-2.44-1.41-1.41c-.2-.2-.51-.2-.71 0l-1.06 1.06 2.12 2.12 1.06-1.06c.2-.2.2-.51 0-.71z"})]
                                               "AppRegistrationRounded"))
