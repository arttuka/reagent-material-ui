(ns reagent-mui.icons.align-horizontal-right-rounded
  "Imports @mui/icons-material/AlignHorizontalRightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def align-horizontal-right-rounded (create-svg-icon (e "path" #js {"d" "M21 2c.55 0 1 .45 1 1v18c0 .55-.45 1-1 1s-1-.45-1-1V3c0-.55.45-1 1-1zM3.5 10h13c.83 0 1.5-.67 1.5-1.5S17.33 7 16.5 7h-13C2.67 7 2 7.67 2 8.5S2.67 10 3.5 10zm6 7h7c.83 0 1.5-.67 1.5-1.5s-.67-1.5-1.5-1.5h-7c-.83 0-1.5.67-1.5 1.5S8.67 17 9.5 17z"})
                                                     "AlignHorizontalRightRounded"))
