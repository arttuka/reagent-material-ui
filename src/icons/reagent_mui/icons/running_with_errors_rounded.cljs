(ns reagent-mui.icons.running-with-errors-rounded
  "Imports @mui/icons-material/RunningWithErrorsRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def running-with-errors-rounded (create-svg-icon (e "path" #js {"d" "M21 18c-.55 0-1-.45-1-1v-6c0-.55.45-1 1-1s1 .45 1 1v6c0 .55-.45 1-1 1zm0 2c-.55 0-1 .45-1 1s.45 1 1 1 1-.45 1-1-.45-1-1-1zm-3-2.71C16.53 18.95 14.39 20 12 20c-4.41 0-8-3.59-8-8s3.59-8 8-8v9l7.55-7.55C17.72 3.34 15.02 2 12 2 6.48 2 2 6.48 2 12s4.48 10 10 10c2.25 0 4.33-.74 6-2v-2.71z"})
                                                  "RunningWithErrorsRounded"))
