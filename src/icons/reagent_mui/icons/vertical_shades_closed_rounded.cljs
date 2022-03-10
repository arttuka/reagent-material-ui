(ns reagent-mui.icons.vertical-shades-closed-rounded
  "Imports @mui/icons-material/VerticalShadesClosedRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-shades-closed-rounded (create-svg-icon (e "path" #js {"d" "M20 19V5c0-1.1-.9-2-2-2H6c-1.1 0-2 .9-2 2v14H3c-.55 0-1 .45-1 1s.45 1 1 1h18c.55 0 1-.45 1-1s-.45-1-1-1h-1zM13 5h1.5v14H13V5zm-2 14H9.5V5H11v14zM6 5h1.5v14H6V5zm10.5 14V5H18v14h-1.5z"})
                                                     "VerticalShadesClosedRounded"))
