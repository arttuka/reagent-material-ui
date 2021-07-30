(ns reagent-material-ui.icons.local-convenience-store-two-tone
  "Imports @material-ui/icons/LocalConvenienceStoreTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def local-convenience-store-two-tone (create-svg-icon [(e "path" #js {"d" "M14 14h2v4h4V9h-3V6H7v3H4v9h4v-4h6zm-1-7h1v2h1V7h1v5h-1v-2h-2V7zM8 9h2V8H8V7h3v3H9v1h2v1H8V9z", "opacity" ".3"}) (e "path" #js {"d" "M10 16h4v4h8V7h-3V4H5v3H2v13h8v-4zm-2 0v2H4V9h3V6h10v3h3v9h-4v-4H8v2zm3-5H9v-1h2V7H8v1h2v1H8v3h3zm4 1h1V7h-1v2h-1V7h-1v3h2z"})]
                                                       "LocalConvenienceStoreTwoTone"))
