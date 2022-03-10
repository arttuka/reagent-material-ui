(ns reagent-mui.icons.battery-4-bar-outlined
  "Imports @mui/icons-material/Battery4BarOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-4-bar-outlined (create-svg-icon (e "path" #js {"d" "M17 5v16c0 .55-.45 1-1 1H8c-.55 0-1-.45-1-1V5c0-.55.45-1 1-1h2V2h4v2h2c.55 0 1 .45 1 1zm-2 1H9v6h6V6z"})
                                             "Battery4BarOutlined"))
