(ns reagent-mui.icons.dataset-outlined
  "Imports @mui/icons-material/DatasetOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def dataset-outlined (create-svg-icon [(e "path" #js {"d" "M7 13h4v4H7zm6 0h4v4h-4z"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}) (e "path" #js {"d" "M7 7h4v4H7zm6 0h4v4h-4z"})]
                                       "DatasetOutlined"))
