(ns reagent-material-ui.icons.photo-filter-sharp
  "Imports @material-ui/icons/PhotoFilterSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def photo-filter-sharp (create-svg-icon (e "path" #js {"d" "M19 10v9H4.98V5h9V3H3v18h18V10h-2zm-2 0 .94-2.06L20 7l-2.06-.94L17 4l-.94 2.06L14 7l2.06.94L17 10zm-3.75.75L12 8l-1.25 2.75L8 12l2.75 1.25L12 16l1.25-2.75L16 12l-2.75-1.25z"})
                                         "PhotoFilterSharp"))
