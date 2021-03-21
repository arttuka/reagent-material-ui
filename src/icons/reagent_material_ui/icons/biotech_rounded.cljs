(ns reagent-material-ui.icons.biotech-rounded
  "Imports @material-ui/icons/BiotechRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def biotech-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 20c0 .55.45 1 1 1h12c.55 0 1-.45 1-1s-.45-1-1-1h-5v-2h4c.55 0 1-.45 1-1s-.45-1-1-1h-6.88c-1.44 0-2.76-.96-3.05-2.37-.28-1.35.36-2.58 1.39-3.19C8.17 9.03 8 8.54 8 8c0-.21.04-.42.09-.62C6.28 8.13 5 9.92 5 12c0 2.76 2.24 5 5 5v2H6c-.55 0-1 .45-1 1zm5.56-14.49C11.91 5.54 13 6.64 13 8c0 .75-.33 1.41-.85 1.87l.25.68c.19.52.76.79 1.28.6.19.52.76.79 1.28.6.52-.19.79-.76.6-1.28.52-.19.79-.76.6-1.28L14.1 3.54c-.19-.52-.76-.79-1.28-.6-.19-.52-.76-.79-1.28-.6-.52.19-.79.76-.6 1.28-.52.19-.79.76-.6 1.28l.22.61z"}) (e "circle" #js {"cy" "8", "r" "1.5", "cx" "10.5"}))
                                      "BiotechRounded"))
