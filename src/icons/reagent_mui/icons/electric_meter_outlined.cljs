(ns reagent-mui.icons.electric-meter-outlined
  "Imports @mui/icons-material/ElectricMeterOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def electric-meter-outlined (create-svg-icon [(e "path" #js {"d" "M21 11c0-4.97-4.03-9-9-9s-9 4.03-9 9c0 3.92 2.51 7.24 6 8.48V22h2v-2.06c.33.04.66.06 1 .06s.67-.02 1-.06V22h2v-2.52c3.49-1.24 6-4.56 6-8.48zm-9 7c-3.86 0-7-3.14-7-7s3.14-7 7-7 7 3.14 7 7-3.14 7-7 7z"}) (e "path" #js {"d" "M8 7h8v2H8zm4.75 3-3 3L11 14.25 9.75 15.5l1.5 1.5 3-3L13 12.75l1.25-1.25z"})]
                                              "ElectricMeterOutlined"))
