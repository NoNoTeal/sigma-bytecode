public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u8df4\ud217\u67e9\ubefe\ub19c {
    public void \u8df4\ud217\u67e9\ubefe\ub19c() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u8df4\ud217\u67e9\ubefe\ub19c)
            putfield:Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(\u8df4\ud217\u67e9\ubefe\ub19c::\ubb2b\u7043\u120d\ufe34\u4f52, this:\u8df4\ud217\u67e9\ubefe\ub19c, initobject:HashMap<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>[expected:Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>](HashMap<K, V>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\u7d52\u8258\u4975\u3dd3\u69d9(java.lang.Object p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u69d9\ua3b4\uf9c5\ua3b4\u6d69 p1) {
        var_5_6D : ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_5_6D = checkcast:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>(java.util.ArrayList<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u69d9\ua3b4\uf9c5\ua3b4\u6d69>.class, invokeinterface:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>(Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>::get, getfield:Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(\u8df4\ud217\u67e9\ubefe\ub19c::\ubb2b\u7043\u120d\ufe34\u4f52, this:\u8df4\ud217\u67e9\ubefe\ub19c), p0:Object))
        
        if (cmpeq:boolean(var_5_6D:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>, aconstnull:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>())) {
            invokeinterface:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>(Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>::put, getfield:Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(\u8df4\ud217\u67e9\ubefe\ub19c::\ubb2b\u7043\u120d\ufe34\u4f52, this:\u8df4\ud217\u67e9\ubefe\ub19c), p0:Object, var_5_6D = initobject:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>(ArrayList::<init>))
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(ArrayList<E>::contains, var_5_6D:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>, p1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69[expected:Object]))) {
            invokevirtual:boolean(ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>::add, var_5_6D:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>, p1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69)
            return:void()
        }
        
        invokeinterface:void(\u624e\u4f4a\u59ec\uae87\uc29a::\uafe7\u960f\u71f1\ub19c\u99f7, invokevirtual:\u624e\u4f4a\u59ec\uae87\uc29a(\u6b0d\ua068\uc4d2\u5245\u4d85::\u156b\u7e3f\u51fa\u927d\u8bb0, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), and:int(ldc:int(23559), ldc:int(-24112))))
    }
    
    public void \u8308\u7d52\u8258\u4975\u3dd3\u69d9(java.lang.Object p0) {
        var_2_5F : int
        var_4_67 : Field[]
        var_5_6C : int
        var_6_75 : int
        var_7_C1 : Field
        var_4_A5 : Method[]
        var_5_AA : int
        var_6_B3 : int
        var_7_101 : Method
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_5F = and:int(ldc:int(2105810395), ldc:int(2139045855))
            var_4_67 = invokevirtual:Field[](Class<T>::getFields, invokevirtual:Class<?>(Object::getClass, p0:Object))
            var_5_6C = arraylength:int(var_4_67:Field[])
            var_6_75 = and:int(ldc:int(4427), ldc:int(-4460))
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(2090196121))
                    
                    if (cmplt:boolean(var_6_75:int, var_5_6C:int)) {
                        var_7_C1 = loadelement:Field(var_4_67:Field[], var_6_75:int)
                        
                        if (invokestatic:boolean(\u74b1\uc7fe\ucfaf\ube23\ubf56::\u7049\u52d3\u8640\u5654\u1833\ub18d, var_7_C1:Field)) {
                            invokevirtual:void(\u8df4\ud217\u67e9\ubefe\ub19c::\u8308\u7d52\u8258\u4975\u3dd3\u69d9, this:\u8df4\ud217\u67e9\ubefe\ub19c, p0:Object, initobject:\u74b1\uc7fe\ucfaf\ube23\ubf56(\u74b1\uc7fe\ucfaf\ube23\ubf56::<init>, var_7_C1:Field, p0:Object))
                        }
                        
                        inc:int(var_6_75, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-53562784))
            }
            
            var_4_A5 = invokevirtual:Method[](Class<T>::getMethods, invokevirtual:Class<?>(Object::getClass, p0:Object))
            var_5_AA = arraylength:int(var_4_A5:Method[])
            var_6_B3 = and:int(ldc:int(19273), ldc:int(-19274))
            
            while (cmplt:boolean(var_6_B3:int, var_5_AA:int)) {
                var_7_101 = loadelement:Method(var_4_A5:Method[], var_6_B3:int)
                
                if (invokestatic:boolean(\ub102\u8753\u0a06\u62da\u74b1::\ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25, var_7_101:Method)) {
                    invokevirtual:void(\u8df4\ud217\u67e9\ubefe\ub19c::\u8308\u7d52\u8258\u4975\u3dd3\u69d9, this:\u8df4\ud217\u67e9\ubefe\ub19c, p0:Object, initobject:\ub102\u8753\u0a06\u62da\u74b1(\ub102\u8753\u0a06\u62da\u74b1::<init>, var_7_101:Method, p0:Object))
                }
                
                inc:int(var_6_B3, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0b8e\ua61f\u74b1\u385b\u8308\u946b(java.lang.String p0, java.lang.String[] p1) {
        var_3_24D : int
        var_5_6E : Iterator<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>
        var_6_A9 : Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>
        var_8_E6 : Iterator<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>
        var_9_108 : \u69d9\ua3b4\uf9c5\ua3b4\u6d69
        var_10_228 : String
        var_11_237 : String[]
        var_12_240 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_24D = and:int(ldc:int(687366747), ldc:int(-1448231013))
            var_5_6E = invokeinterface:Iterator<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>(Set<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>::iterator, invokeinterface:Set<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>(Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>::entrySet, getfield:Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(\u8df4\ud217\u67e9\ubefe\ub19c::\ubb2b\u7043\u120d\ufe34\u4f52, this:\u8df4\ud217\u67e9\ubefe\ub19c)))
            
            loop {
                if (cmpne:boolean(and:int(var_3_24D:int, ldc:int(512)), ldc:int(0))) {
                    var_3_24D = and:int(var_3_24D:int, ldc:int(-1346556369))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_6E:Iterator<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>)) {
                        var_6_A9 = checkcast:Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(java.util.Map.Entry<java.lang.Object, java.util.ArrayList<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>.class, invokeinterface:Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(Iterator<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>::next, var_5_6E:Iterator<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>))
                        
                        if (invokevirtual:boolean(String::equalsIgnoreCase, p0:String, invokeinterface:String(\u836c\u6c52\u40a9\uc2e8\ud36e::\u718f\u7e3f\uc238\u5f50\u183a\uc2e8, checkcast:\u836c\u6c52\u40a9\uc2e8\ud36e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u836c\u6c52\u40a9\uc2e8\ud36e.class, invokevirtual:\u836c\u6c52\u40a9\uc2e8\ud36e(Class<?>::getAnnotation, invokevirtual:Class<?>(Object::getClass, invokeinterface:Object(Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>::getKey, var_6_A9:Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>)), ldc:Class<\u836c\u6c52\u40a9\uc2e8\ud36e>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u836c\u6c52\u40a9\uc2e8\ud36e.class)))))) {
                            var_8_E6 = invokevirtual:Iterator<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>(ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>::iterator, checkcast:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>(java.util.ArrayList<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u69d9\ua3b4\uf9c5\ua3b4\u6d69>.class, invokeinterface:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>(Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>::getValue, var_6_A9:Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>)))
                            
                            loop {
                                var_3_24D = and:int(var_3_24D:int, ldc:int(-57104553))
                                
                                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_E6:Iterator<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>))) {
                                    looporswitchbreak()
                                }
                                
                                var_9_108 = checkcast:\u69d9\ua3b4\uf9c5\ua3b4\u6d69(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u69d9\ua3b4\uf9c5\ua3b4\u6d69.class, invokeinterface:\u69d9\ua3b4\uf9c5\ua3b4\u6d69(Iterator<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>::next, var_8_E6:Iterator<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>))
                                
                                if (logicalnot:boolean(instanceof:boolean(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u74b1\uc7fe\ucfaf\ube23\ubf56.class, var_9_108:\u69d9\ua3b4\uf9c5\ua3b4\u6d69))) {
                                    goto(Label_0274)
                                }
                                
                                if (cmpeq:boolean(p1:String[], aconstnull:String[]())) {
                                    goto(Label_0354)
                                }
                                
                                if (cmplt:boolean(arraylength:int(p1:String[]), and:int(ldc:int(315), ldc:int(4101)))) {
                                    goto(Label_0354)
                                }
                                
                                if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, loadelement:String(p1:String[], and:int(ldc:int(17468), ldc:int(-17469))), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), xor:int(ldc:int(16481), ldc:int(16480)))))) {
                                    goto(Label_0354)
                                }
                                
                                if (cmplt:boolean(arraylength:int(p1:String[]), xor:int(ldc:int(327), ldc:int(325)))) {
                                    goto(Label_0354)
                                }
                                
                                if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, loadelement:String(p1:String[], and:int(ldc:int(4931), ldc:int(25605))), invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u4e72\u600f\u8258\u7ce1\u8413\uafe7, var_9_108:\u69d9\ua3b4\uf9c5\ua3b4\u6d69)))) {
                                    goto(Label_0354)
                                }
                                
                                var_10_228 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), and:int(ldc:int(16386), ldc:int(514)))), loadelement:String(p1:String[], and:int(ldc:int(988), ldc:int(-17373)))), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), and:int(ldc:int(162), ldc:int(17486)))), loadelement:String(p1:String[], and:int(ldc:int(81), ldc:int(5)))))
                                var_11_237 = newarray:String[](java.lang.String.class, sub:int(arraylength:int(p1:String[]), xor:int(ldc:int(-26496), ldc:int(-26494))))
                                var_12_240 = and:int(ldc:int(16450), ldc:int(2055))
                                Label_0578:
                                
                                while (cmpne:boolean(and:int(var_3_24D:int, ldc:int(512)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_3_24D:int, ldc:int(536870912)), ldc:int(0))) {
                                        goto(Label_0612)
                                    }
                                    
                                    var_3_24D = and:int(var_3_24D:int, ldc:int(-1164826069))
                                    
                                    if (cmpge:boolean(var_12_240:int, arraylength:int(p1:String[]))) {
                                        goto(Label_0612)
                                    }
                                    
                                    storeelement:String(var_11_237:String[], sub:int(var_12_240:int, xor:int(ldc:int(16512), ldc:int(16514))), loadelement:String(p1:String[], var_12_240:int))
                                    inc:int(var_12_240, ldc:int(1))
                                }
                                
                                var_3_24D = and:int(var_3_24D:int, ldc:int(79442720))
                                Label_0805:
                                
                                while (cmpeq:boolean(and:int(var_3_24D:int, ldc:int(1024)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_3_24D:int, ldc:int(65536)), ldc:int(0))) {
                                        goto(Label_0578)
                                    }
                                    
                                    var_3_24D = and:int(var_3_24D:int, ldc:int(786789207))
                                    
                                    if (cmpge:boolean(var_12_240:int, arraylength:int(p1:String[]))) {
                                        var_3_24D = and:int(var_3_24D:int, ldc:int(949369667))
                                        invokevirtual:void(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u93a2\u92ee\u9255\uc2e8\u9937\uc87f, var_9_108:\u69d9\ua3b4\uf9c5\ua3b4\u6d69, var_10_228:String, var_11_237:String[])
                                        goto(Label_0354)
                                    }
                                    
                                    storeelement:String(var_11_237:String[], sub:int(var_12_240:int, xor:int(ldc:int(8709), ldc:int(8708))), loadelement:String(p1:String[], var_12_240:int))
                                    inc:int(var_12_240, ldc:int(1))
                                }
                                
                                goto(Label_0612)
                                Label_0274:
                                
                                if (cmpeq:boolean(and:int(var_3_24D:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_0354)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_24D:int, ldc:int(131072)), ldc:int(0))) {
                                    var_3_24D = and:int(var_3_24D:int, ldc:int(-240731017))
                                }
                                else {
                                    var_3_24D = and:int(var_3_24D:int, ldc:int(-1466126749))
                                    
                                    if (instanceof:boolean(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub102\u8753\u0a06\u62da\u74b1.class, var_9_108:\u69d9\ua3b4\uf9c5\ua3b4\u6d69)) {
                                        if (cmpeq:boolean(p1:String[], aconstnull:String[]())) {
                                            goto(Label_0354)
                                        }
                                        
                                        if (cmplt:boolean(arraylength:int(p1:String[]), and:int(ldc:int(5443), ldc:int(2213)))) {
                                            goto(Label_0354)
                                        }
                                        
                                        if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, loadelement:String(p1:String[], and:int(ldc:int(11344), ldc:int(-32245))), invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u4e72\u600f\u8258\u7ce1\u8413\uafe7, var_9_108:\u69d9\ua3b4\uf9c5\ua3b4\u6d69)))) {
                                            goto(Label_0354)
                                        }
                                        
                                        var_10_228 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), and:int(ldc:int(11346), ldc:int(11)))), loadelement:String(p1:String[], and:int(ldc:int(-19128), ldc:int(19091)))))
                                        var_11_237 = newarray:String[](java.lang.String.class, sub:int(arraylength:int(p1:String[]), xor:int(ldc:int(8460), ldc:int(8461))))
                                        var_12_240 = xor:int(ldc:int(1170), ldc:int(1171))
                                        goto(Label_0805)
                                    }
                                }
                                
                                Label_0309:
                                
                                if (cmpne:boolean(and:int(var_3_24D:int, ldc:int(536870912)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_3_24D:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_3_24D = and:int(var_3_24D:int, ldc:int(1266180796))
                                        goto(Label_0274)
                                    }
                                    
                                    var_3_24D = and:int(var_3_24D:int, ldc:int(-1430525197))
                                    invokevirtual:void(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u93a2\u92ee\u9255\uc2e8\u9937\uc87f, var_9_108:\u69d9\ua3b4\uf9c5\ua3b4\u6d69, p0:String, p1:String[])
                                }
                                
                                Label_0354:
                                
                                if (cmpne:boolean(and:int(var_3_24D:int, ldc:int(262144)), ldc:int(0))) {
                                    var_3_24D = and:int(var_3_24D:int, ldc:int(100525747))
                                    goto(Label_0309)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_24D:int, ldc:int(131072)), ldc:int(0))) {
                                    var_3_24D = and:int(var_3_24D:int, ldc:int(-288691617))
                                    loopcontinue()
                                }
                                
                                goto(Label_0274)
                                Label_0612:
                                
                                if (cmpeq:boolean(and:int(var_3_24D:int, ldc:int(512)), ldc:int(0))) {
                                    var_3_24D = and:int(var_3_24D:int, ldc:int(636056018))
                                    goto(Label_0805)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_24D:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_24D = and:int(var_3_24D:int, ldc:int(-392938649))
                                    invokevirtual:void(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u93a2\u92ee\u9255\uc2e8\u9937\uc87f, var_9_108:\u69d9\ua3b4\uf9c5\ua3b4\u6d69, var_10_228:String, var_11_237:String[])
                                    goto(Label_0354)
                                }
                                
                                goto(Label_0578)
                            }
                        }
                        
                        var_3_24D = and:int(var_3_24D:int, ldc:int(-360271893))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_24D:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_24D = and:int(var_3_24D:int, ldc:int(72221183))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ub70c\u6d99\u760c\uc3e3\u516c\uff55(java.lang.String p0, java.lang.String[] p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(aconstnull:String())
        }
        
        goto(Label_0006)
    }
    
    public java.util.ArrayList<java.lang.String> \u99f7\u8aa5\u8709\u52d3\u960f\u392e(java.lang.String p0, java.lang.String[] p1) {
        var_3_535 : int
        var_5_67 : ArrayList<String>
        var_6_77 : Iterator<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>
        var_7_B4 : Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>
        var_9_14B : Iterator<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>
        var_10_1C1 : \u69d9\ua3b4\uf9c5\ua3b4\u6d69
        var_11_50F : String
        var_12_51E : String[]
        var_13_527 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_535 = and:int(ldc:int(-1793488100), ldc:int(-744699265))
            var_5_67 = initobject:ArrayList<String>(ArrayList<E>::<init>)
            var_6_77 = invokeinterface:Iterator<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>(Set<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>::iterator, invokeinterface:Set<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>(Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>::entrySet, getfield:Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(\u8df4\ud217\u67e9\ubefe\ub19c::\ubb2b\u7043\u120d\ufe34\u4f52, this:\u8df4\ud217\u67e9\ubefe\ub19c)))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(512)), ldc:int(0))) {
                    var_3_535 = and:int(var_3_535:int, ldc:int(2144115767))
                }
                else {
                    var_3_535 = and:int(var_3_535:int, ldc:int(-277378148))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_77:Iterator<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>)) {
                        var_7_B4 = checkcast:Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(java.util.Map.Entry<java.lang.Object, java.util.ArrayList<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>.class, invokeinterface:Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(Iterator<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>::next, var_6_77:Iterator<Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>>))
                        
                        if (invokevirtual:boolean(String::equalsIgnoreCase, p0:String, invokeinterface:String(\u836c\u6c52\u40a9\uc2e8\ud36e::\u718f\u7e3f\uc238\u5f50\u183a\uc2e8, checkcast:\u836c\u6c52\u40a9\uc2e8\ud36e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u836c\u6c52\u40a9\uc2e8\ud36e.class, invokevirtual:\u836c\u6c52\u40a9\uc2e8\ud36e(Class<?>::getAnnotation, invokevirtual:Class<?>(Object::getClass, invokeinterface:Object(Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>::getKey, var_7_B4:Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>)), ldc:Class<\u836c\u6c52\u40a9\uc2e8\ud36e>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u836c\u6c52\u40a9\uc2e8\ud36e.class)))))) {
                            if (cmpne:boolean(p1:String[], aconstnull:String[]())) {
                                goto(Label_0246)
                            }
                            
                            invokevirtual:boolean(ArrayList<String>::add, var_5_67:ArrayList<String>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), and:int(ldc:int(24667), ldc:int(131))))))
                            goto(Label_0288)
                        }
                        
                        Label_0216:
                        
                        if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0288)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(2)), ldc:int(0))) {
                            var_3_535 = and:int(var_3_535:int, ldc:int(-105590786))
                            loopcontinue()
                        }
                        
                        Label_0246:
                        
                        if (cmpne:boolean(and:int(var_3_535:int, ldc:int(32)), ldc:int(0))) {
                            var_3_535 = and:int(var_3_535:int, ldc:int(-171751935))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_3_535:int, ldc:int(4096)), ldc:int(0))) {
                                var_3_535 = and:int(var_3_535:int, ldc:int(-1024453666))
                                goto(Label_0216)
                            }
                            
                            var_3_535 = and:int(var_3_535:int, ldc:int(-2082996227))
                            
                            if (cmple:boolean(arraylength:int(p1:String[]), ldc:int(0))) {
                                invokevirtual:boolean(ArrayList<String>::add, var_5_67:ArrayList<String>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), xor:int(ldc:int(10240), ldc:int(10243))))))
                            }
                        }
                        
                        Label_0288:
                        
                        if (cmpne:boolean(and:int(var_3_535:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_535 = and:int(var_3_535:int, ldc:int(1467288243))
                            goto(Label_0246)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_535:int, ldc:int(8)), ldc:int(0))) {
                            var_3_535 = and:int(var_3_535:int, ldc:int(-1983980546))
                            var_9_14B = invokevirtual:Iterator<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>(ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>::iterator, checkcast:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>(java.util.ArrayList<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u69d9\ua3b4\uf9c5\ua3b4\u6d69>.class, invokeinterface:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>(Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>::getValue, var_7_B4:Entry<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>)))
                            
                            while (invokeinterface:boolean(Iterator<E>::hasNext, var_9_14B:Iterator<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>)) {
                                var_10_1C1 = checkcast:\u69d9\ua3b4\uf9c5\ua3b4\u6d69(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u69d9\ua3b4\uf9c5\ua3b4\u6d69.class, invokeinterface:\u69d9\ua3b4\uf9c5\ua3b4\u6d69(Iterator<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>::next, var_9_14B:Iterator<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>))
                                
                                if (logicalnot:boolean(instanceof:boolean(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u74b1\uc7fe\ucfaf\ube23\ubf56.class, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69))) {
                                    goto(Label_0459)
                                }
                                
                                if (cmpeq:boolean(p1:String[], aconstnull:String[]())) {
                                    loopcontinue()
                                }
                                
                                if (cmplt:boolean(arraylength:int(p1:String[]), xor:int(ldc:int(228), ldc:int(229)))) {
                                    loopcontinue()
                                }
                                
                                if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, loadelement:String(p1:String[], and:int(ldc:int(2769), ldc:int(-2770))), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), and:int(ldc:int(3245), ldc:int(17)))))) {
                                    goto(Label_0708)
                                }
                                
                                if (cmplt:boolean(arraylength:int(p1:String[]), and:int(ldc:int(2246), ldc:int(28930)))) {
                                    goto(Label_0917)
                                }
                                
                                if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, loadelement:String(p1:String[], xor:int(ldc:int(17921), ldc:int(17920))), invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u4e72\u600f\u8258\u7ce1\u8413\uafe7, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69)))) {
                                    goto(Label_1090)
                                }
                                
                                var_11_50F = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), and:int(ldc:int(2082), ldc:int(8198)))), loadelement:String(p1:String[], and:int(ldc:int(31136), ldc:int(-31139)))), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), and:int(ldc:int(2), ldc:int(99)))), loadelement:String(p1:String[], and:int(ldc:int(8271), ldc:int(18209)))))
                                var_12_51E = newarray:String[](java.lang.String.class, sub:int(arraylength:int(p1:String[]), and:int(ldc:int(16450), ldc:int(6158))))
                                var_13_527 = xor:int(ldc:int(67), ldc:int(65))
                                Label_1321:
                                
                                while (cmpeq:boolean(and:int(var_3_535:int, ldc:int(536870912)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(512)), ldc:int(0))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(2090658526))
                                        goto(Label_1366)
                                    }
                                    
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-1793998850))
                                    
                                    if (cmpge:boolean(var_13_527:int, arraylength:int(p1:String[]))) {
                                        goto(Label_1366)
                                    }
                                    
                                    storeelement:String(var_12_51E:String[], sub:int(var_13_527:int, xor:int(ldc:int(16435), ldc:int(16433))), loadelement:String(p1:String[], var_13_527:int))
                                    inc:int(var_13_527, ldc:int(1))
                                }
                                
                                var_3_535 = and:int(var_3_535:int, ldc:int(1986637361))
                                Label_1898:
                                
                                while (cmpeq:boolean(and:int(var_3_535:int, ldc:int(1024)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_3_535:int, ldc:int(32)), ldc:int(0))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(1765665307))
                                        goto(Label_1321)
                                    }
                                    
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-436954403))
                                    
                                    if (cmpge:boolean(var_13_527:int, arraylength:int(p1:String[]))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(-1655309570))
                                        invokevirtual:boolean(ArrayList<String>::add, var_5_67:ArrayList<String>, invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u8aa5\ud51e\u3e2a\u494c\u7049\u120d, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69, var_11_50F:String, var_12_51E:String[]))
                                        goto(Label_0823)
                                    }
                                    
                                    storeelement:String(var_12_51E:String[], sub:int(var_13_527:int, and:int(ldc:int(33), ldc:int(24833))), loadelement:String(p1:String[], var_13_527:int))
                                    inc:int(var_13_527, ldc:int(1))
                                }
                                
                                var_3_535 = and:int(var_3_535:int, ldc:int(1505925406))
                                goto(Label_1366)
                                Label_0459:
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(4096)), ldc:int(0))) {
                                    goto(Label_1720)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_1539)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-71658320))
                                    goto(Label_1090)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_0917)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(2048)), ldc:int(0))) {
                                    goto(Label_0823)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_0708)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(16)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-1780892995))
                                    
                                    if (instanceof:boolean(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub102\u8753\u0a06\u62da\u74b1.class, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69)) {
                                        if (cmpeq:boolean(p1:String[], aconstnull:String[]())) {
                                            goto(Label_1539)
                                        }
                                        
                                        if (cmplt:boolean(arraylength:int(p1:String[]), xor:int(ldc:int(-31648), ldc:int(-31647)))) {
                                            goto(Label_1539)
                                        }
                                        
                                        if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, loadelement:String(p1:String[], and:int(ldc:int(8346), ldc:int(-12443))), invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u4e72\u600f\u8258\u7ce1\u8413\uafe7, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69)))) {
                                            goto(Label_1720)
                                        }
                                        
                                        var_11_50F = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), xor:int(ldc:int(1073), ldc:int(1075)))), loadelement:String(p1:String[], and:int(ldc:int(-29926), ldc:int(28901)))))
                                        var_12_51E = newarray:String[](java.lang.String.class, sub:int(arraylength:int(p1:String[]), xor:int(ldc:int(576), ldc:int(577))))
                                        var_13_527 = xor:int(ldc:int(8320), ldc:int(8321))
                                        goto(Label_1898)
                                    }
                                }
                                
                                Label_0535:
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(8)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-1922883049))
                                    goto(Label_1720)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(1)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-939108033))
                                    goto(Label_1539)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-1220226097))
                                    goto(Label_1090)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(33554432)), ldc:int(0))) {
                                    goto(Label_0917)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(311144649))
                                    goto(Label_0823)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(536870912)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_3_535:int, ldc:int(32768)), ldc:int(0))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(-1118646468))
                                        invokevirtual:boolean(ArrayList<String>::add, var_5_67:ArrayList<String>, invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u8aa5\ud51e\u3e2a\u494c\u7049\u120d, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69, p0:String, p1:String[]))
                                        goto(Label_0823)
                                    }
                                    
                                    goto(Label_0459)
                                }
                                
                                Label_0708:
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(2)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(1712688807))
                                    goto(Label_1720)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_1539)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_1090)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(2048)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(1363771073))
                                    goto(Label_0917)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(4096)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(21535411))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_3_535:int, ldc:int(32)), ldc:int(0))) {
                                        goto(Label_0535)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_535:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Label_0459)
                                    }
                                    
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-1174627396))
                                    
                                    if (invokevirtual:boolean(String::startsWith, loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), xor:int(ldc:int(9), ldc:int(8))), invokevirtual:String(String::toLowerCase, loadelement:String(p1:String[], and:int(ldc:int(13384), ldc:int(-13385)))))) {
                                        invokevirtual:boolean(ArrayList<String>::add, var_5_67:ArrayList<String>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), and:int(ldc:int(11), ldc:int(17555))))))
                                    }
                                }
                                
                                Label_0823:
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(512)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-1474459591))
                                    goto(Label_1720)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_1539)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(2048)), ldc:int(0))) {
                                    goto(Label_1090)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(1024)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-1384445894))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_0708)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_535:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_0535)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_535:int, ldc:int(4)), ldc:int(0))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(-948654337))
                                        loopcontinue()
                                    }
                                    
                                    goto(Label_0459)
                                }
                                
                                Label_0917:
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(16)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-1007634500))
                                    goto(Label_1720)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_1539)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(512)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-132647757))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_3_535:int, ldc:int(16384)), ldc:int(0))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(-1167061375))
                                        goto(Label_0823)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(16)), ldc:int(0))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(-1336073504))
                                        goto(Label_0708)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_535:int, ldc:int(134217728)), ldc:int(0))) {
                                        goto(Label_0535)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(1048576)), ldc:int(0))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(-1659844870))
                                        goto(Label_0459)
                                    }
                                    
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-713827684))
                                    invokevirtual:boolean(ArrayList<String>::add, var_5_67:ArrayList<String>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), and:int(ldc:int(132), ldc:int(16740)))), invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u4e72\u600f\u8258\u7ce1\u8413\uafe7, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69))))
                                    goto(Label_0823)
                                }
                                
                                Label_1090:
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(512)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(2067827502))
                                    goto(Label_1720)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(16384)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-654767069))
                                    goto(Label_1539)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(8)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-1395898575))
                                    goto(Label_0917)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_0823)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-135262822))
                                    goto(Label_0708)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_0535)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-271832888))
                                    goto(Label_0459)
                                }
                                
                                var_3_535 = and:int(var_3_535:int, ldc:int(-103363747))
                                
                                if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, invokevirtual:String(String::toUpperCase, invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u4e72\u600f\u8258\u7ce1\u8413\uafe7, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69)), invokevirtual:String(String::toUpperCase, loadelement:String(p1:String[], xor:int(ldc:int(165), ldc:int(164))))))) {
                                    goto(Label_0823)
                                }
                                
                                invokevirtual:boolean(ArrayList<String>::add, var_5_67:ArrayList<String>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), xor:int(ldc:int(261), ldc:int(257)))), invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u4e72\u600f\u8258\u7ce1\u8413\uafe7, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69))))
                                goto(Label_0823)
                                Label_1366:
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_1898)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(2048)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(585598744))
                                    goto(Label_1321)
                                }
                                
                                var_3_535 = and:int(var_3_535:int, ldc:int(-1275360516))
                                invokevirtual:boolean(ArrayList<String>::add, var_5_67:ArrayList<String>, invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u8aa5\ud51e\u3e2a\u494c\u7049\u120d, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69, var_11_50F:String, var_12_51E:String[]))
                                goto(Label_0823)
                                Label_1539:
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(536870912)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_3_535:int, ldc:int(4096)), ldc:int(0))) {
                                        goto(Label_1090)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(512)), ldc:int(0))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(-349920192))
                                        goto(Label_0917)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(16777216)), ldc:int(0))) {
                                        goto(Label_0823)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(512)), ldc:int(0))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(-1849093019))
                                        goto(Label_0708)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_535:int, ldc:int(16384)), ldc:int(0))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(-433046835))
                                        goto(Label_0535)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(16)), ldc:int(0))) {
                                        var_3_535 = and:int(var_3_535:int, ldc:int(-709878548))
                                        goto(Label_0459)
                                    }
                                    
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-640311780))
                                    invokevirtual:boolean(ArrayList<String>::add, var_5_67:ArrayList<String>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), xor:int(ldc:int(8388), ldc:int(8390)))), invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u4e72\u600f\u8258\u7ce1\u8413\uafe7, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69))))
                                    goto(Label_0823)
                                }
                                
                                Label_1720:
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_1539)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(4)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(-323335672))
                                    goto(Label_1090)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_0917)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_0823)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(2048)), ldc:int(0))) {
                                    goto(Label_0708)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(16384)), ldc:int(0))) {
                                    var_3_535 = and:int(var_3_535:int, ldc:int(1333316323))
                                    goto(Label_0535)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_535:int, ldc:int(8)), ldc:int(0))) {
                                    goto(Label_0459)
                                }
                                
                                var_3_535 = and:int(var_3_535:int, ldc:int(-686637122))
                                
                                if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, invokevirtual:String(String::toUpperCase, invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u4e72\u600f\u8258\u7ce1\u8413\uafe7, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69)), invokevirtual:String(String::toUpperCase, loadelement:String(p1:String[], and:int(ldc:int(8511), ldc:int(-10112))))))) {
                                    goto(Label_0823)
                                }
                                
                                invokevirtual:boolean(ArrayList<String>::add, var_5_67:ArrayList<String>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee), and:int(ldc:int(12358), ldc:int(18218)))), invokevirtual:String(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::\u4e72\u600f\u8258\u7ce1\u8413\uafe7, var_10_1C1:\u69d9\ua3b4\uf9c5\ua3b4\u6d69))))
                                goto(Label_0823)
                            }
                        }
                        
                        goto(Label_0216)
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_535:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:ArrayList<String>(var_5_67:ArrayList<String>)
        }
        
        goto(Label_0006)
    }
    
    public void \u93a2\u7bad\u946b\u4ab3\ub171\u0b8e(java.lang.Object p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokeinterface:ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>(Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>::remove, getfield:Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(\u8df4\ud217\u67e9\ubefe\ub19c::\ubb2b\u7043\u120d\ufe34\u4f52, this:\u8df4\ud217\u67e9\ubefe\ub19c), p0:Object)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.Object, java.util.ArrayList<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u69d9\ua3b4\uf9c5\ua3b4\u6d69>> \u759a\u760c\u494c\ub70c\u7873\ua61f() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(getfield:Map<Object, ArrayList<\u69d9\ua3b4\uf9c5\ua3b4\u6d69>>(\u8df4\ud217\u67e9\ubefe\ub19c::\ubb2b\u7043\u120d\ufe34\u4f52, this:\u8df4\ud217\u67e9\ubefe\ub19c))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_92 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_C4_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_205_0 : byte[] [generated]
        stack_282_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_19D : byte[]
        var_4_19E : int
        expr_97 : int [generated]
        var_5_1EE : int
        var_3_1F3 : byte[]
        var_4_1F4 : int
        var_0_21F : int
        expr_205 : byte [generated]
        stack_24D_2 : byte [generated]
        stack_222_0 : byte [generated]
        expr_C6 : int [generated]
        var_3_270 : byte[]
        var_4_271 : int
        expr_285 : byte [generated]
        var_3_F5 : String
        stack_194_0 : String[] [generated]
        expr_107 : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_0_92 = and:int(ldc:int(1723371952), ldc:int(-299198218))
            expr_68 = var_2_6C = stack_95_0 = stack_97_0 = stack_C4_0 = stack_C6_0 = stack_E9_0 = stack_205_0 = stack_282_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AAGu+Y3ZrvmN3xmLDwcAhn6JeYXiKgR/Yaz+C/9kq/mKA4J956l+4ioEf2Gs/gv/YqqEgIR+jH8HYimO/v8EavujAw5aKgaHBlqqhQZ8jP6BhXIe+Yww"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_19D = newarray:byte[](byte.class, expr_70:int)
                var_4_19E = expr_70:int
                
                loop {
                    var_0_92 = and:int(var_0_92:int, ldc:int(-487859039))
                    var_4_19E = add:int(var_4_19E:int, ldc:int(-1))
                    storeelement:byte(var_3_19D:byte[], var_4_19E:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_19E:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_19E:int, xor:int(ldc:int(2056), ldc:int(2057)))), ldc:int(3)), and:int(ldc:int(223), ldc:int(1599)))))
                    
                    if (cmpne:boolean(var_4_19E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_C4_0 = stack_C6_0 = stack_E9_0 = stack_205_0 = stack_282_0 = var_3_19D:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_92:int, ldc:int(512)), ldc:int(0))) {
                    var_0_92 = and:int(var_0_92:int, ldc:int(-1875292073))
                    goto(Label_0203)
                }
                
                if (cmpeq:boolean(and:int(var_0_92:int, ldc:int(64)), ldc:int(0))) {
                    var_0_92 = and:int(var_0_92:int, ldc:int(-256756547))
                    expr_97 = arraylength:int(stack_97_0:byte[])
                    
                    if (cmpne:boolean(expr_97:int, ldc:int(0))) {
                        var_5_1EE = expr_97:int
                        var_3_1F3 = newarray:byte[](byte.class, expr_97:int)
                        var_4_1F4 = expr_97:int
                        
                        loop {
                            var_0_21F = and:int(var_0_92:int, ldc:int(1840127918))
                            var_4_1F4 = add:int(var_4_1F4:int, ldc:int(-1))
                            expr_205 = stack_24D_2 = loadelement(stack_205_0, var_4_1F4)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_1F4:int, ldc:int(1)), neg:int(var_5_1EE:int)), ldc:int(0))) {
                                stack_24D_2 = stack_222_0 = add:byte(expr_205:byte, loadelement:byte(var_3_1F3:byte[], add:int(var_4_1F4:int, ldc:int(1))))
                                goto(Label_0562)
                            }
                            
                            Label_0530:
                            
                            if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(2097152)), ldc:int(0))) {
                                var_0_21F = and:int(var_0_21F:int, ldc:int(-214583572))
                                stack_24D_2 = stack_222_0 = add:byte(expr_205:byte, ldc:byte(1))
                            }
                            
                            Label_0562:
                            
                            if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(536870912)), ldc:int(0))) {
                                var_0_21F = and:int(var_0_21F:int, ldc:int(270990830))
                                goto(Label_0530)
                            }
                            
                            var_0_92 = and:int(var_0_21F:int, ldc:int(1786681508))
                            storeelement:byte(var_3_1F3:byte[], var_4_1F4:int, stack_24D_2:byte)
                            
                            if (cmpne:boolean(var_4_1F4:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_C4_0 = stack_C6_0 = stack_E9_0 = stack_205_0 = stack_282_0 = var_3_1F3:byte[]
                    }
                }
                
                Label_0156:
                
                if (cmpeq:boolean(and:int(var_0_92:int, ldc:int(32)), ldc:int(0))) {
                    var_0_92 = and:int(var_0_92:int, ldc:int(953889572))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_92:int, ldc:int(4096)), ldc:int(0))) {
                        var_0_92 = and:int(var_0_92:int, ldc:int(1757655241))
                        loopcontinue()
                    }
                    
                    var_0_92 = and:int(var_0_92:int, ldc:int(-273107726))
                    expr_C6 = arraylength:int(stack_C6_0:byte[])
                    
                    if (cmpne:boolean(expr_C6:int, ldc:int(0))) {
                        var_3_270 = newarray:byte[](byte.class, expr_C6:int)
                        var_4_271 = expr_C6:int
                        
                        loop {
                            var_0_92 = and:int(var_0_92:int, ldc:int(-257467663))
                            var_4_271 = add:int(var_4_271:int, ldc:int(-1))
                            expr_285 = xor:byte(loadelement:byte(stack_282_0:byte[], var_4_271:int), ldc:byte(87))
                            storeelement:byte(var_3_270:byte[], var_4_271:int, add:int(or:int(and:int(shl:int(expr_285:byte, xor:int(ldc:int(74), ldc:int(78))), ldc:int(-16)), and:int(shr:int(expr_285:byte[expected:int], xor:int(ldc:int(19463), ldc:int(19459))), ldc:int(15))), ldc:int(103)))
                            
                            if (cmpne:boolean(var_4_271:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_C4_0 = stack_C6_0 = stack_E9_0 = stack_205_0 = stack_282_0 = var_3_270:byte[]
                    }
                }
                
                Label_0203:
                
                if (cmpne:boolean(and:int(var_0_92:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_92 = and:int(var_0_92:int, ldc:int(255308903))
                    goto(Label_0156)
                }
                
                if (cmpeq:boolean(and:int(var_0_92:int, ldc:int(262144)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_F5 = initobject:String(String::<init>, stack_E9_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_194_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-28407), ldc:int(-28404)))
            expr_107 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16457), ldc:int(16460)))
            storeelement:String(expr_107:String[], xor:int(ldc:int(12418), ldc:int(12416)), invokevirtual:String[expected:String](String::substring, var_3_F5:String, and:int(ldc:int(3041), ldc:int(-3046)), xor:int(ldc:int(12417), ldc:int(12416))))
            storeelement:String(expr_107:String[], and:int(ldc:int(19107), ldc:int(13339)), invokevirtual:String[expected:String](String::substring, var_3_F5:String, xor:int(ldc:int(1162), ldc:int(1163)), xor:int(ldc:int(2180), ldc:int(2177))))
            storeelement:String(expr_107:String[], and:int(ldc:int(108), ldc:int(20487)), invokevirtual:String[expected:String](String::substring, var_3_F5:String, and:int(ldc:int(20567), ldc:int(9357)), xor:int(ldc:int(4416), ldc:int(4426))))
            storeelement:String(expr_107:String[], and:int(ldc:int(-13278), ldc:int(4445)), invokevirtual:String[expected:String](String::substring, var_3_F5:String, xor:int(ldc:int(7188), ldc:int(7198)), xor:int(ldc:int(16411), ldc:int(16456))))
            storeelement:String(expr_107:String[], and:int(ldc:int(8195), ldc:int(6689)), invokevirtual:String[expected:String](String::substring, var_3_F5:String, xor:int(ldc:int(135), ldc:int(212)), and:int(ldc:int(598), ldc:int(9438))))
            putstatic:String[](\u8df4\ud217\u67e9\ubefe\ub19c::\uc7fe\ud171\u99f7\uc246\u92ee, expr_107:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc84e\u40a9\uc9f6\u4492\u3776\u4c04(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B6 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6C1 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_6B6 = and:int(ldc:int(640997332), ldc:int(-1897107465))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8df4\ud217\u67e9\ubefe\ub19c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(8192)), ldc:int(0))) {
            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1423249452))
            var_5_81 = and:int(ldc:int(-10929), ldc:int(10928))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-24487), ldc:int(24454)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6B6:int, ldc:int(103707869))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(673), ldc:int(672)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(513), ldc:int(1281)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6B6 = and:int(var_3_DA:int, ldc:int(237493748))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(1696), ldc:int(1697)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(225597120))
                        goto(Label_1598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1100306672))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1329)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1781727955))
                        goto(Label_1192)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1001)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1672991835))
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(2053558705))
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1555407061))
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(305034493))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0588)
                            }
                            
                            goto(Label_0880)
                        }
                    }
                    
                    Label_0426:
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1598)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(374935279))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1329)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1236237599))
                        goto(Label_1001)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-262130163))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-86059407))
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(505432063))
                        var_11_EB = and:int(ldc:int(19180), ldc:int(-28397))
                        goto(Label_1587)
                    }
                    
                    Label_0588:
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1059397807))
                        goto(Label_1598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1284334341))
                        goto(Label_1329)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1001)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(986452975))
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(678603864))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(290060513))
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1800556392))
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(586607861))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0880)
                        }
                    }
                    
                    Label_0726:
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1598)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1048133683))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1610455559))
                        goto(Label_1329)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(493781079))
                        goto(Label_1001)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1680587187))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1230328987))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1511107165))
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1760618007))
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(440192988))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0880:
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1089831235))
                        goto(Label_1598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1811624986))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-460789819))
                        goto(Label_1329)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-969099896))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1435371788))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(16800), ldc:int(16801))
                                goto(Label_1192)
                            }
                        }
                    }
                    
                    Label_1001:
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-185269504))
                        goto(Label_1598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-2045082287))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1329)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1254116250))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1582472690))
                            goto(Label_0880)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(2000353218))
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1485566781))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(524632907))
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1344027382))
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-760326180))
                        var_11_EB = and:int(ldc:int(9278), ldc:int(-9279))
                    }
                    
                    Label_1192:
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1611036946))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1510512595))
                            goto(Label_1001)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1317329944))
                            goto(Label_0880)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1643107426))
                            goto(Label_0726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-615093890))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1319362381))
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1812267042))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1452)
                            }
                        }
                    }
                    
                    Label_1329:
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1598)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1747195333))
                            goto(Label_1192)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1001)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-744000555))
                            goto(Label_0880)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-392694256))
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(107804373))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1587)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1452:
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(147451795))
                        goto(Label_1329)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1001)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(187014804))
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1919140862))
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(979650875))
                        goto(Label_0426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6B6 = and:int(var_3_6B6:int, ldc:int(917163988))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1587:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C1 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1598:
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1329)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-108634137))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(321563220))
                        goto(Label_1001)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1187561936))
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(83169993))
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(639718190))
                        goto(Label_0426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(66417876))
                        var_17_6C1 = add:int(var_16_119:int, xor:int(ldc:int(16488), ldc:int(16489)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1955535370))
                
                if (cmple:boolean(var_5_81 = var_17_6C1:int, sub:int(var_6_88:int, and:int(ldc:int(17419), ldc:int(12805))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(881468916))
            goto(Label_0108)
        }
    }
}
