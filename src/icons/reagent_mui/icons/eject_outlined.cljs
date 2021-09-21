(ns reagent-mui.icons.eject-outlined
  "Imports @mui/icons-material/EjectOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def eject-outlined (create-svg-icon (e "path" #js {"d" "M5 17h14v2H5zm7-12L5.33 15h13.34L12 5zm0 3.6 2.93 4.4H9.07L12 8.6z"})
                                     "EjectOutlined"))
