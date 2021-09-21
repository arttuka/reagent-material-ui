(ns reagent-mui.icons.g-mobiledata-outlined
  "Imports @mui/icons-material/GMobiledataOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def g-mobiledata-outlined (create-svg-icon (e "path" #js {"d" "M12 11v2h2v2H9V9h7c0-1.1-.9-2-2-2H9c-1.1 0-2 .9-2 2v6c0 1.1.9 2 2 2h5c1.1 0 2-.9 2-2v-4h-4z"})
                                            "GMobiledataOutlined"))
