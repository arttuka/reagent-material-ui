(ns reagent-mui.icons.hourglass-full-two-tone
  "Imports @mui/icons-material/HourglassFullTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def hourglass-full-two-tone (create-svg-icon [(e "path" #js {"d" "m8 7.5 4 4 4-4V4H8zm0 9V20h8v-3.5l-4-4z", "opacity" ".3"}) (e "path" #js {"d" "M18 2H6v6h.01L6 8.01 10 12l-4 4 .01.01H6V22h12v-5.99h-.01L18 16l-4-4 4-3.99-.01-.01H18V2zm-2 14.5V20H8v-3.5l4-4 4 4zm0-9-4 4-4-4V4h8v3.5z"})]
                                              "HourglassFullTwoTone"))
