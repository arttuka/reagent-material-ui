(ns reagent-mui.icons.h-plus-mobiledata
  "Imports @mui/icons-material/HPlusMobiledata as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def h-plus-mobiledata (create-svg-icon (e "path" #js {"d" "M12 11H6V7H4v10h2v-4h6v4h2V7h-2v4zm10 0h-2V9h-2v2h-2v2h2v2h2v-2h2v-2z"})
                                        "HPlusMobiledata"))
