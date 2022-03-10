(ns reagent-mui.icons.tornado-two-tone
  "Imports @mui/icons-material/TornadoTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tornado-two-tone (create-svg-icon [(e "path" #js {"d" "M9.1 13h5.8l1.74-3H7.36zm2.9 5.01L13.74 15h-3.48zM4.47 5l1.74 3h11.58l1.74-3z", "opacity" ".3"}) (e "path" #js {"d" "m1 3 11 19L23 3H1zm11 15.01L10.26 15h3.48L12 18.01zM14.9 13H9.1l-1.74-3h9.27l-1.73 3zM6.21 8 4.47 5h15.06l-1.74 3H6.21z"})]
                                       "TornadoTwoTone"))
