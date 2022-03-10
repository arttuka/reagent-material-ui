(ns reagent-mui.icons.screenshot-monitor-sharp
  "Imports @mui/icons-material/ScreenshotMonitorSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def screenshot-monitor-sharp (create-svg-icon [(e "path" #js {"d" "M22 3H2v16h6v2h8v-2h6V3zm-2 14H4V5h16v12z"}) (e "path" #js {"d" "M6.5 7.5H9V6H5v4h1.5zM19 12h-1.5v2.5H15V16h4z"})]
                                               "ScreenshotMonitorSharp"))
