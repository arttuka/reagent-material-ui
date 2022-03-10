(ns reagent-mui.icons.electric-meter-two-tone
  "Imports @mui/icons-material/ElectricMeterTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def electric-meter-two-tone (create-svg-icon [(e "path" #js {"d" "M12 4c-3.86 0-7 3.14-7 7s3.14 7 7 7 7-3.14 7-7-3.14-7-7-7zm2.25 10-3 3-1.5-1.5L11 14.25 9.75 13l3-3 1.5 1.5L13 12.75 14.25 14zM16 9H8V7h8v2z", "opacity" ".3"}) (e "path" #js {"d" "M12 2c-4.97 0-9 4.03-9 9 0 3.92 2.51 7.24 6 8.48V22h2v-2.06c.33.04.66.06 1 .06s.67-.02 1-.06V22h2v-2.52c3.49-1.24 6-4.56 6-8.48 0-4.97-4.03-9-9-9zm0 16c-3.86 0-7-3.14-7-7s3.14-7 7-7 7 3.14 7 7-3.14 7-7 7z"}) (e "path" #js {"d" "M8 7h8v2H8zm4.75 3-3 3L11 14.25 9.75 15.5l1.5 1.5 3-3L13 12.75l1.25-1.25z"})]
                                              "ElectricMeterTwoTone"))
