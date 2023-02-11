(ns reagent-mui.icons.dataset-two-tone
  "Imports @mui/icons-material/DatasetTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def dataset-two-tone (create-svg-icon [(e "path" #js {"d" "M5 19h14V5H5v14zm8-12h4v4h-4V7zm0 6h4v4h-4v-4zM7 7h4v4H7V7zm0 6h4v4H7v-4z", "opacity" ".3"}) (e "path" #js {"d" "M7 13h4v4H7zm6 0h4v4h-4z"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}) (e "path" #js {"d" "M7 7h4v4H7zm6 0h4v4h-4z"})]
                                       "DatasetTwoTone"))
