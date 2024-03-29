(ns reagent-mui.icons.map-two-tone
  "Imports @mui/icons-material/MapTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def map-two-tone (create-svg-icon [(e "path" #js {"d" "m5 18.31 3-1.16V5.45L5 6.46zm11 .24 3-1.01V5.69l-3 1.17z", "opacity" ".3"}) (e "path" #js {"d" "m20.5 3-.16.03L15 5.1 9 3 3.36 4.9c-.21.07-.36.25-.36.48V20.5c0 .28.22.5.5.5l.16-.03L9 18.9l6 2.1 5.64-1.9c.21-.07.36-.25.36-.48V3.5c0-.28-.22-.5-.5-.5zM8 17.15l-3 1.16V6.46l3-1.01v11.7zm6 1.38-4-1.4V5.47l4 1.4v11.66zm5-.99-3 1.01V6.86l3-1.16v11.84z"})]
                                   "MapTwoTone"))
