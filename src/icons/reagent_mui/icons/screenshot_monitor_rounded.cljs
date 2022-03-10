(ns reagent-mui.icons.screenshot-monitor-rounded
  "Imports @mui/icons-material/ScreenshotMonitorRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def screenshot-monitor-rounded (create-svg-icon [(e "path" #js {"d" "M20 3H4c-1.1 0-2 .9-2 2v12c0 1.1.89 2 2 2h4v1c0 .55.45 1 1 1h6c.55 0 1-.45 1-1v-1h4c1.1 0 2-.9 2-2V5c0-1.11-.9-2-2-2zm0 14H4V5h16v12z"}) (e "path" #js {"d" "M6.5 7.5h1.75c.41 0 .75-.34.75-.75S8.66 6 8.25 6H6c-.55 0-1 .45-1 1v2.25c0 .41.34.75.75.75s.75-.34.75-.75V7.5zM18.25 12c-.41 0-.75.34-.75.75v1.75h-1.75c-.41 0-.75.34-.75.75s.34.75.75.75H18c.55 0 1-.45 1-1v-2.25c0-.41-.34-.75-.75-.75z"})]
                                                 "ScreenshotMonitorRounded"))
