(ns reagent-material-ui.icons.support-agent-sharp
  "Imports @material-ui/icons/SupportAgentSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def support-agent-sharp (create-svg-icon [(e "circle" #js {"cx" "9", "cy" "13", "r" "1"}) (e "circle" #js {"cx" "15", "cy" "13", "r" "1"}) (e "path" #js {"d" "M18 11.03C17.52 8.18 15.04 6 12.05 6c-3.03 0-6.29 2.51-6.03 6.45 2.47-1.01 4.33-3.21 4.86-5.89 1.31 2.63 4 4.44 7.12 4.47z"}) (e "path" #js {"d" "M20.99 12c-.11-5.37-4.31-9-8.99-9-4.61 0-8.85 3.53-8.99 9H2v6h3v-5.81c0-3.83 2.95-7.18 6.78-7.29 3.96-.12 7.22 3.06 7.22 7V19h-8v2h10v-3h1v-6h-1.01z"})]
                                          "SupportAgentSharp"))
