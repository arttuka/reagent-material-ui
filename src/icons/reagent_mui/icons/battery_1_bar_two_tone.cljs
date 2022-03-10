(ns reagent-mui.icons.battery-1-bar-two-tone
  "Imports @mui/icons-material/Battery1BarTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-1-bar-two-tone (create-svg-icon [(e "path" #js {"d" "M9 6h6v12H9z", "opacity" ".3"}) (e "path" #js {"d" "M17 5v16c0 .55-.45 1-1 1H8c-.55 0-1-.45-1-1V5c0-.55.45-1 1-1h2V2h4v2h2c.55 0 1 .45 1 1zm-2 1H9v12h6V6z"})]
                                             "Battery1BarTwoTone"))
