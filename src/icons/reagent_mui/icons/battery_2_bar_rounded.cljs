(ns reagent-mui.icons.battery-2-bar-rounded
  "Imports @mui/icons-material/Battery2BarRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-2-bar-rounded (create-svg-icon (e "path" #js {"d" "M17 5v16c0 .55-.45 1-1 1H8c-.55 0-1-.45-1-1V5c0-.55.45-1 1-1h2V3c0-.55.45-1 1-1h2c.55 0 1 .45 1 1v1h2c.55 0 1 .45 1 1zm-2 1H9v10h6V6z"})
                                            "Battery2BarRounded"))
