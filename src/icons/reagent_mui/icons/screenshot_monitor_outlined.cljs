(ns reagent-mui.icons.screenshot-monitor-outlined
  "Imports @mui/icons-material/ScreenshotMonitorOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def screenshot-monitor-outlined (create-svg-icon [(e "path" #js {"d" "M20 3H4c-1.11 0-2 .89-2 2v12c0 1.1.89 2 2 2h4v2h8v-2h4c1.1 0 2-.9 2-2V5c0-1.11-.9-2-2-2zm0 14H4V5h16v12z"}) (e "path" #js {"d" "M6.5 7.5H9V6H5v4h1.5zM19 12h-1.5v2.5H15V16h4z"})]
                                                  "ScreenshotMonitorOutlined"))
