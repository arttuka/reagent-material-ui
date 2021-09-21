(ns reagent-mui.icons.lte-mobiledata-outlined
  "Imports @mui/icons-material/LteMobiledataOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def lte-mobiledata-outlined (create-svg-icon (e "path" #js {"d" "M6 14h3v2H4V8h2v6zm3-4h2v6h2v-6h2V8H9v2zm12 0V8h-5v8h5v-2h-3v-1h3v-2h-3v-1h3z"})
                                              "LteMobiledataOutlined"))
