(ns reagent-mui.icons.power-off-two-tone
  "Imports @mui/icons-material/PowerOffTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def power-off-two-tone (create-svg-icon [(e "path" #js {"d" "M12.12 9 16 12.88V9zm-.62 8.17V19h1v-1.83l1.07-1.06L8 10.54v3.11z", "opacity" ".3"}) (e "path" #js {"d" "M10 3H8v1.88l2 2zm6 6v3.88l1.8 1.8.2-.2V9c0-1.1-.9-2-2-2V3h-2v4h-3.88l2 2H16zM4.12 3.84 2.71 5.25 6 8.54v5.96L9.5 18v3h5v-3l.48-.48 4.47 4.47 1.41-1.41L4.12 3.84zm8.38 13.33V19h-1v-1.83L8 13.65v-3.11l5.57 5.57-1.07 1.06z"})]
                                         "PowerOffTwoTone"))
