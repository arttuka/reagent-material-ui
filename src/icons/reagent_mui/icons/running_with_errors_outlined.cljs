(ns reagent-mui.icons.running-with-errors-outlined
  "Imports @mui/icons-material/RunningWithErrorsOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def running-with-errors-outlined (create-svg-icon (e "path" #js {"d" "M22 10v8h-2v-8h2zm-2 10v2h2v-2h-2zm-2-2.71C16.53 18.95 14.39 20 12 20c-4.41 0-8-3.59-8-8s3.59-8 8-8v9l7.55-7.55C17.72 3.34 15.02 2 12 2 6.48 2 2 6.48 2 12s4.48 10 10 10c2.25 0 4.33-.74 6-2v-2.71z"})
                                                   "RunningWithErrorsOutlined"))
