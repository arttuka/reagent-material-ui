(ns reagent-mui.icons.panorama-vertical-sharp
  "Imports @mui/icons-material/PanoramaVerticalSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def panorama-vertical-sharp (create-svg-icon (e "path" #js {"d" "M17.46 4c-.77 2.6-1.16 5.28-1.16 8 0 2.72.39 5.41 1.16 8H6.55c.77-2.6 1.16-5.28 1.16-8 0-2.72-.39-5.41-1.16-8h10.91m2.78-2H3.77s.26.77.3.88C5.16 5.82 5.71 8.91 5.71 12s-.55 6.18-1.64 9.12c-.04.11-.3.88-.3.88h16.47s-.26-.77-.3-.88c-1.09-2.94-1.64-6.03-1.64-9.12s.55-6.18 1.64-9.12c.04-.11.3-.88.3-.88z"})
                                              "PanoramaVerticalSharp"))
