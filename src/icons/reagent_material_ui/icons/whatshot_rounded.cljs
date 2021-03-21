(ns reagent-material-ui.icons.whatshot-rounded
  "Imports @material-ui/icons/WhatshotRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def whatshot-rounded (create-svg-icon (e "path" #js {"d" "M10.46 2.12c-4.06.61-7.4 3.77-8.24 7.8-.47 2.26-.15 4.41.7 6.26l4.37-4.37c.37-.37.95-.39 1.35-.06l2.3 1.92 3.35-3.35-.59-.59c-.62-.65-.18-1.73.71-1.73H17c.55 0 1 .45 1 1v2.59c0 .89-1.08 1.34-1.71.71l-.59-.59-4 4c-.36.36-.95.39-1.34.06l-2.31-1.91-4.08 4.08c2.08 2.8 5.57 4.49 9.43 3.96 4.52-.61 8.12-4.37 8.56-8.91.62-6.48-4.96-11.85-11.5-10.87z"})
                                       "WhatshotRounded"))
