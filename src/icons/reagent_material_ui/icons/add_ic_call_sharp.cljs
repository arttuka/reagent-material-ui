(ns reagent-material-ui.icons.add-ic-call-sharp
  "Imports @material-ui/icons/AddIcCallSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def add-ic-call-sharp (create-svg-icon (e "path" #js {"d" "M21 6h-3V3h-2v3h-3v2h3v3h2V8h3zm0 9.46-5.27-.61-2.52 2.52c-2.83-1.44-5.15-3.75-6.59-6.59l2.53-2.53L8.54 3H3.03C2.45 13.18 10.82 21.55 21 20.97v-5.51z"})
                                        "AddIcCallSharp"))
