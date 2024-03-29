(ns reagent-mui.icons.solar-power-two-tone
  "Imports @mui/icons-material/SolarPowerTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def solar-power-two-tone (create-svg-icon [(e "path" #js {"d" "M4.44 20H11v-2H4.84zm13.92-6H13v2h5.76zM13 18v2h6.56l-.4-2zm-7.76-2H11v-2H5.64z", "opacity" ".3"}) (e "path" #js {"d" "M20 12H4L2 22h20l-2-10zm-7 2h5.36l.4 2H13v-2zm-2 6H4.44l.4-2H11v2zm0-4H5.24l.4-2H11v2zm2 4v-2h6.16l.4 2H13zM11 8h2v3h-2zm4.7644-.7948 1.4143-1.4142L19.3 7.9123l-1.4142 1.4142zm-11.0596.7076 2.1213-2.1213 1.4143 1.4142L6.119 9.327zM3 2h3v2H3zm15 0h3v2h-3zm-6 5c2.76 0 5-2.24 5-5h-2c0 1.65-1.35 3-3 3S9 3.65 9 2H7c0 2.76 2.24 5 5 5z"}) (e "path" #js {"d" "M15 2c0 1.66-1.34 3-3 3S9 3.66 9 2h6z", "opacity" ".3"})]
                                           "SolarPowerTwoTone"))
