(ns reagent-mui.icons.local-printshop-outlined
  "Imports @mui/icons-material/LocalPrintshopOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-printshop-outlined (create-svg-icon [(e "path" #js {"d" "M19 8h-1V3H6v5H5c-1.66 0-3 1.34-3 3v6h4v4h12v-4h4v-6c0-1.66-1.34-3-3-3zM8 5h8v3H8V5zm8 14H8v-4h8v4zm2-4v-2H6v2H4v-4c0-.55.45-1 1-1h14c.55 0 1 .45 1 1v4h-2z"}) (e "circle" #js {"cx" "18", "cy" "11.5", "r" "1"})]
                                               "LocalPrintshopOutlined"))
