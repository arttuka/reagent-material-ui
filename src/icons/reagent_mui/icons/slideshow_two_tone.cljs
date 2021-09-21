(ns reagent-mui.icons.slideshow-two-tone
  "Imports @mui/icons-material/SlideshowTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def slideshow-two-tone (create-svg-icon [(e "path" #js {"d" "M5 19h14V5H5v14zm5-11 5 4-5 4V8z", "opacity" ".3"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14zM10 8v8l5-4z"})]
                                         "SlideshowTwoTone"))
