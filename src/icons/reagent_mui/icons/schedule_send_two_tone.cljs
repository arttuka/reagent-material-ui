(ns reagent-mui.icons.schedule-send-two-tone
  "Imports @mui/icons-material/ScheduleSendTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def schedule-send-two-tone (create-svg-icon [(e "path" #js {"d" "m5 10.5 6 1.5-6 1.5v3.49l5.39-2.27c.6-1.73 1.86-3.16 3.48-3.97L5 7.01v3.49z", "opacity" ".3"}) (e "path" #js {"d" "m11 12-6-1.5V7.01l8.87 3.74c.94-.47 2-.75 3.13-.75.1 0 .19.01.28.01L3 4v16l7-2.95V17c0-.8.14-1.56.39-2.28L5 16.99V13.5l6-1.5z"}) (e "path" #js {"d" "M17 12c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm1.65 7.35L16.5 17.2V14h1v2.79l1.85 1.85-.7.71z"})]
                                             "ScheduleSendTwoTone"))
