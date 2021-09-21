(ns reagent-mui.icons.payments-rounded
  "Imports @mui/icons-material/PaymentsRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def payments-rounded (create-svg-icon (e "path" #js {"d" "M23 8v10c0 1.1-.9 2-2 2H5c-.55 0-1-.45-1-1s.45-1 1-1h16V8c0-.55.45-1 1-1s1 .45 1 1zM4 16c-1.66 0-3-1.34-3-3V7c0-1.66 1.34-3 3-3h12c1.66 0 3 1.34 3 3v7c0 1.1-.9 2-2 2H4zm3-6c0 1.66 1.34 3 3 3s3-1.34 3-3-1.34-3-3-3-3 1.34-3 3z"})
                                       "PaymentsRounded"))
