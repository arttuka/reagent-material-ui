(ns reagent-mui.icons.times-one-mobiledata-two-tone
  "Imports @mui/icons-material/TimesOneMobiledataTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def times-one-mobiledata-two-tone (create-svg-icon (e "path" #js {"d" "M4 7h4v10H6V9H4V7zm11.83 4.72L18.66 7h-2.33l-1.66 2.77L13 7h-2.33l2.83 4.72L10.33 17h2.33l2-3.34 2 3.34H19l-3.17-5.28z"})
                                                    "TimesOneMobiledataTwoTone"))
