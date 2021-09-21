(ns reagent-mui.icons.clear-all-two-tone
  "Imports @mui/icons-material/ClearAllTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def clear-all-two-tone (create-svg-icon (e "path" #js {"d" "M5 11h14v2H5zm-2 4h14v2H3zm4-8h14v2H7z"})
                                         "ClearAllTwoTone"))
