(ns reagent-material-ui.icons.directions-boat-filled-outlined
  "Imports @material-ui/icons/DirectionsBoatFilledOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def directions-boat-filled-outlined (create-svg-icon (e "path" #js {"d" "M19.77 12.66l-1.12 3.97c-.78-.43-1.07-.86-2.65-2.67-1.6 1.82-2.43 3.04-4 3.04-1.53 0-2.34-1.15-4-3.04-1.6 1.82-1.87 2.21-2.65 2.65l-1.13-3.96L12 10.11l7.77 2.55zM15 1H9v3H6c-1.1 0-2 .9-2 2v4.62l-1.29.42c-.63.19-.81.84-.66 1.28L3.95 19H4c1.6 0 3.02-.88 4-2 .98 1.12 2.4 2 4 2s3.02-.88 4-2c.98 1.12 2.4 2 4 2h.05l1.91-6.68c.11-.37.04-1.06-.66-1.28l-1.3-.42V6c0-1.1-.9-2-2-2h-3V1zM6 9.97V6h12v3.97L12 8 6 9.97zm10 9.71c-1.22.85-2.61 1.28-4 1.28s-2.78-.43-4-1.28C6.78 20.53 5.39 21 4 21H2v2h2c1.38 0 2.74-.35 4-.99 1.26.64 2.63.97 4 .97s2.74-.32 4-.97c1.26.65 2.62.99 4 .99h2v-2h-2c-1.39 0-2.78-.47-4-1.32z"})
                                                      "DirectionsBoatFilledOutlined"))
