(ns reagent-mui.icons.lan-two-tone
  "Imports @mui/icons-material/LanTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def lan-two-tone (create-svg-icon [(e "path" #js {"d" "M10 7V4h4v3h-4zM9 17v3H5v-3h4zm10 0v3h-4v-3h4z", "opacity" ".3"}) (e "path" #js {"d" "M13 22h8v-7h-3v-4h-5V9h3V2H8v7h3v2H6v4H3v7h8v-7H8v-2h8v2h-3v7zM10 7V4h4v3h-4zM9 17v3H5v-3h4zm10 0v3h-4v-3h4z"})]
                                   "LanTwoTone"))
