(ns reagent-mui.icons.eject
  "Imports @mui/icons-material/Eject as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def eject (create-svg-icon (e "path" #js {"d" "M5 17h14v2H5zm7-12L5.33 15h13.34z"})
                            "Eject"))
