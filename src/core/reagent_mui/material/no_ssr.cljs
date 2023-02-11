(ns reagent-mui.material.no-ssr
  "Imports @mui/material/NoSsr as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/no-ssr/ ."
  (:require [reagent.core :as r]
            ["@mui/material/NoSsr" :as MuiNoSsr]))

(def no-ssr (r/adapt-react-class (.-default MuiNoSsr)))
