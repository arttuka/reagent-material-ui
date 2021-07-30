(ns reagent-material-ui.icons.filter-alt-two-tone
  "Imports @material-ui/icons/FilterAltTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-alt-two-tone (create-svg-icon [(e "path" #js {"d" "M7 6h10l-5.01 6.3L7 6zm-2.75-.39C6.27 8.2 10 13 10 13v6c0 .55.45 1 1 1h2c.55 0 1-.45 1-1v-6s3.72-4.8 5.74-7.39c.51-.66.04-1.61-.79-1.61H5.04c-.83 0-1.3.95-.79 1.61z"}) (e "path" #js {"d" "M7 6h10l-5.01 6.3z", "opacity" ".3"})]
                                          "FilterAltTwoTone"))
