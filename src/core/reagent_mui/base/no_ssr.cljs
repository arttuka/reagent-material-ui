(ns reagent-mui.base.no-ssr
  "Imports @mui/base/NoSsr as a Reagent component.
   Original documentation is at https://mui.com/base/api/no-ssr/ ."
  (:require [reagent.core :as r]
            ["@mui/base/NoSsr" :as MuiNoSsr]))

(def no-ssr (r/adapt-react-class (.-default MuiNoSsr)))
