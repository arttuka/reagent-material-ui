(ns reagent-mui.icons.hourglass-top-two-tone
  "Imports @mui/icons-material/HourglassTopTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def hourglass-top-two-tone (create-svg-icon [(e "path" #js {"d" "m8 7.5 4 4 4-4V4H8z", "opacity" ".3"}) (e "path" #js {"d" "m8 7.5 4 4 4-4V4H8z", "opacity" ".3"}) (e "path" #js {"d" "M18 2H6v6l4 4-3.99 4.01L6 22h12l-.01-5.99L14 12l4-3.99V2zm-2 14.5V20H8v-3.5l4-4 4 4zm0-9-4 4-4-4V4h8v3.5z"})]
                                             "HourglassTopTwoTone"))
