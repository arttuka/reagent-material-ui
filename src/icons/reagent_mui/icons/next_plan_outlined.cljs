(ns reagent-mui.icons.next-plan-outlined
  "Imports @mui/icons-material/NextPlanOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def next-plan-outlined (create-svg-icon [(e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"}) (e "path" #js {"d" "M15.97 11.03C14.87 9.79 13.28 9 11.5 9c-2.82 0-5.18 1.95-5.82 4.56l.96.32C7.15 11.66 9.13 10 11.5 10c1.51 0 2.85.68 3.76 1.74L13 14h5V9l-2.03 2.03z"})]
                                         "NextPlanOutlined"))
