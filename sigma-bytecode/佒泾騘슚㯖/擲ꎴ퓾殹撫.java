public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u64f2\ua3b4\ud4fe\u6bb9\u64ab {
    public void \u64f2\ua3b4\ud4fe\u6bb9\u64ab() {
        var_3_C5 : File
        var_4_EF : int
        
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
            invokespecial:\ud158\u839e\u7006\uc3e3\u446c(\ud158\u839e\u7006\uc3e3\u446c::<init>, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, getstatic:\ucef1\u3504\u64f2\u6cfe\u52d3(\ucef1\u3504\u64f2\u6cfe\u52d3::\uc229\u760c\u873d\ub6ab\u7043), loadelement:String(getstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7), and:int(ldc:int(29864), ldc:int(-32426))), loadelement:String(getstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7), and:int(ldc:int(3369), ldc:int(17))))
            putfield:boolean(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u8c8a\ub171\u7e3f\u7049\ubff1, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, xor:int[expected:boolean](ldc:int(260), ldc:int(261)))
            putfield:int(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\uc84e\ub6ab\u7049\u8413\u36d3, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, and:int(ldc:int(10595), ldc:int(-10596)))
            putfield:List<String>(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\ub70c\ua068\u183a\u965f\u4f4a, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, initobject:ArrayList<String>[expected:List<String>](ArrayList<E>::<init>))
            var_3_C5 = initobject:File(File::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:File[expected:Object](\u6b0d\ua068\uc4d2\u5245\u4d85::\u40a9\u983f\u946b\ud36e\u760c, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))), loadelement:String(getstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7), and:int(ldc:int(24579), ldc:int(642))))))
            
            if (invokevirtual:boolean(File::exists, var_3_C5:File)) {
                putfield:List<String>(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\ub70c\ua068\u183a\u965f\u4f4a, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, initobject:ArrayList<E>(ArrayList<Object>::<init>, invokestatic:List<String>(Arrays::asList, invokevirtual:String[](File::list, var_3_C5:File))))
                var_4_EF = and:int(ldc:int(25284), ldc:int(-25285))
                
                while (cmplt:boolean(var_4_EF:int, invokeinterface:int(List<E>::size, getfield:List<String>(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\ub70c\ua068\u183a\u965f\u4f4a, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)))) {
                    if (invokevirtual:boolean(String::startsWith, checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, getfield:List<String>(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\ub70c\ua068\u183a\u965f\u4f4a, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab), var_4_EF:int)), loadelement:String(getstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7), and:int(ldc:int(24611), ldc:int(2455))))) {
                        invokeinterface:String(List<String>::remove, getfield:List<String>(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\ub70c\ua068\u183a\u965f\u4f4a, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab), var_4_EF:int)
                        looporswitchbreak()
                    }
                    
                    inc:int(var_4_EF, ldc:int(1))
                }
                
                invokevirtual:void(\ud158\u839e\u7006\uc3e3\u446c::\u1187\u4bc8\u61a4\u839e\ubff1, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab[expected:\ud158\u839e\u7006\uc3e3\u446c], initobject:\uc4d2\uc238\u8413\u527a\u52d3[expected:\uc246\u71f1\ua068\u59ec\u516c](\uc4d2\uc238\u8413\u527a\u52d3::<init>, loadelement:String(getstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7), and:int(ldc:int(2388), ldc:int(13452))), loadelement:String(getstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7), xor:int(ldc:int(16554), ldc:int(16559))), and:int(ldc:int(3217), ldc:int(-3218)), checkcast:String[](java.lang.String[].class, invokeinterface:String[](List<String>::toArray, getfield:List<String>(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\ub70c\ua068\u183a\u965f\u4f4a, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab), newarray:String[](java.lang.String.class, invokeinterface:int(List<E>::size, getfield:List<String>(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\ub70c\ua068\u183a\u965f\u4f4a, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)))))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \ubff1\ud7e8\u93a2\u8cae\u4492(int p0) {
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
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\uceb8\u392e\u9255\u718f\u6c56, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)), invokevirtual:int(\u6b5f\u1187\u3e75\u5d20\ud217::\u67d0\uf9c5\u4d85\u4179\u74b1, invokevirtual:\uafe7\ub19c\ubb2b\uc246\ud158[expected:\u6b5f\u1187\u3e75\u5d20\ud217](\u4f52\u8d90\u965f\u927d\u0a06::\u4daf\u836c\u4179\u527a\u3504, checkcast:\u4f52\u8d90\u965f\u927d\u0a06(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4f52\u8d90\u965f\u927d\u0a06.class, invokeinterface:\u4f52\u8d90\u965f\u927d\u0a06(List<\u4f52\u8d90\u965f\u927d\u0a06>::get, invokevirtual:List<\u4f52\u8d90\u965f\u927d\u0a06>(\u7d52\u7d52\u92ee\u494c\u8640::\u88c5\u071d\u3776\u7049\ub102, getfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)), p0:int))))), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\uceb8\u392e\u9255\u718f\u6c56, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)), invokevirtual:int(\u6b5f\u1187\u3e75\u5d20\ud217::\ub8be\u7873\u36d3\ub102\u8258, invokevirtual:\uafe7\ub19c\ubb2b\uc246\ud158[expected:\u6b5f\u1187\u3e75\u5d20\ud217](\u4f52\u8d90\u965f\u927d\u0a06::\u4daf\u836c\u4179\u527a\u3504, checkcast:\u4f52\u8d90\u965f\u927d\u0a06(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4f52\u8d90\u965f\u927d\u0a06.class, invokeinterface:\u4f52\u8d90\u965f\u927d\u0a06(List<\u4f52\u8d90\u965f\u927d\u0a06>::get, invokevirtual:List<\u4f52\u8d90\u965f\u927d\u0a06>(\u7d52\u7d52\u92ee\u494c\u8640::\u88c5\u071d\u3776\u7049\ub102, getfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)), p0:int))))), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\uceb8\u392e\u9255\u718f\u6c56, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)), invokevirtual:int(\u6b5f\u1187\u3e75\u5d20\ud217::\u6fb0\u4bc8\u3bd6\u516c\u40a9, invokevirtual:\uafe7\ub19c\ubb2b\uc246\ud158[expected:\u6b5f\u1187\u3e75\u5d20\ud217](\u4f52\u8d90\u965f\u927d\u0a06::\u4daf\u836c\u4179\u527a\u3504, checkcast:\u4f52\u8d90\u965f\u927d\u0a06(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4f52\u8d90\u965f\u927d\u0a06.class, invokeinterface:\u4f52\u8d90\u965f\u927d\u0a06(List<\u4f52\u8d90\u965f\u927d\u0a06>::get, invokevirtual:List<\u4f52\u8d90\u965f\u927d\u0a06>(\u7d52\u7d52\u92ee\u494c\u8640::\u88c5\u071d\u3776\u7049\ub102, getfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)), p0:int)))))))
        }
        
        goto(Label_0006)
    }
    
    private \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a \ua068\u5d20\u7d52\uf9c5\uc229(int p0) {
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
            return:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokestatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u6d69\u67d0\u7e3f\u56bd\u8bb0\ucb79, invokevirtual:short[expected:int](\u4f52\u8d90\u965f\u927d\u0a06::\u4c2b\ud36e\u3711\ubded\uc29a, checkcast:\u4f52\u8d90\u965f\u927d\u0a06(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4f52\u8d90\u965f\u927d\u0a06.class, invokeinterface:\u4f52\u8d90\u965f\u927d\u0a06(List<\u4f52\u8d90\u965f\u927d\u0a06>::get, invokevirtual:List<\u4f52\u8d90\u965f\u927d\u0a06>(\u7d52\u7d52\u92ee\u494c\u8640::\u88c5\u071d\u3776\u7049\ub102, getfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)), p0:int))))))
        }
        
        goto(Label_0006)
    }
    
    private \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u6fb0\ub113\uceb8\u0c95\ua6bd() {
        expr_70 : int [generated]
        
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
            putfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u960f\u385b\u93a2\uc84e\u7006, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, invokespecial:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\ua068\u5d20\u7d52\uf9c5\uc229, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, getfield:int(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u72f1\u64f2\uae87\ufcaf\u59ec, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)))
            expr_70 = getfield:int(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u72f1\u64f2\uae87\ufcaf\u59ec, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)
            putfield:int(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u72f1\u64f2\uae87\ufcaf\u59ec, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, add:int(expr_70:int, and:int(ldc:int(4555), ldc:int(1025))))
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u51fa\u494c\u71f1\u7330\u12cb, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, invokespecial:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\ubff1\ud7e8\u93a2\u8cae\u4492, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, expr_70:int)))
        }
        
        goto(Label_0006)
    }
    
    private \ub113\ufcaf\u3c25\u071d\u97b7.\u0c95\u97b7\ud523\ub171\u0b8e \ubff1\ucef1\u7006\u3a62\u8709() {
        stack_76_0 : List<\u0c95\u97b7\ud523\ub171\u0b8e> [generated]
        expr_67 : int [generated]
        
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
            stack_76_0 = getfield:List<\u0c95\u97b7\ud523\ub171\u0b8e>(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\ud523\uc246\ub1b9\ud217\u8c8a, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)
            expr_67 = getfield:int(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\uae87\u71f1\ub171\u7043\u965f, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)
            putfield:int(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\uae87\u71f1\ub171\u7043\u965f, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, add:int(expr_67:int, xor:int(ldc:int(-29664), ldc:int(-29663))))
            return:\u0c95\u97b7\ud523\ub171\u0b8e(putfield:\u0c95\u97b7\ud523\ub171\u0b8e(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u4c2b\u965f\u494c\u8753\u7043, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, checkcast:\u0c95\u97b7\ud523\ub171\u0b8e(\ub113\ufcaf\u3c25\u071d\u97b7.\u0c95\u97b7\ud523\ub171\u0b8e.class, invokeinterface:\u0c95\u97b7\ud523\ub171\u0b8e(List<\u0c95\u97b7\ud523\ub171\u0b8e>::get, stack_76_0:List<\u0c95\u97b7\ud523\ub171\u0b8e>, expr_67:int))))
        }
        
        goto(Label_0006)
    }
    
    public void \ub6ab\ube23\uae87\uc84e\u1833() {
        var_1_5F : int
        var_3_9D : File
        
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
        var_1_5F = and:int(ldc:int(2020679750), ldc:int(1028087376))
        var_3_9D = initobject:File(File::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:File[expected:Object](\u6b0d\ua068\uc4d2\u5245\u4d85::\u40a9\u983f\u946b\ud36e\u760c, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))), loadelement:String(getstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7), xor:int(ldc:int(1664), ldc:int(1670)))), checkcast:String(java.lang.String.class, invokevirtual:Object[expected:String](\ud158\u839e\u7006\uc3e3\u446c::\u12b2\u3d4b\u156b\u071d\uc246, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7), xor:int(ldc:int(160), ldc:int(164))))))))
        
        if (logicalnot:boolean(invokevirtual:boolean(File::exists, var_3_9D:File))) {
            invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, loadelement:String(getstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7), and:int(ldc:int(103), ldc:int(10135))))
            invokevirtual:void(\ud158\u839e\u7006\uc3e3\u446c::\u836c\u6198\ua6bd\u071d\u47c2, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab[expected:\ud158\u839e\u7006\uc3e3\u446c])
            return:void()
        }
        
        loop {
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(128)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(446493206))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1510374834))
                putfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, initobject:\u7d52\u7d52\u92ee\u494c\u8640(\u7d52\u7d52\u92ee\u494c\u8640::<init>, var_3_9D:File))
                
                if (invokevirtual:boolean(\u7d52\u7d52\u92ee\u494c\u8640::\u4f52\uc9f6\u4492\ucef1\u69d9, getfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab))) {
                    if (cmpgt:boolean(invokeinterface:int(List<E>::size, invokevirtual:List<\u4f52\u8d90\u965f\u927d\u0a06>(\u7d52\u7d52\u92ee\u494c\u8640::\u88c5\u071d\u3776\u7049\ub102, getfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab))), ldc:int(0))) {
                        invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokeinterface:int(List<E>::size, invokevirtual:List<\u4f52\u8d90\u965f\u927d\u0a06>(\u7d52\u7d52\u92ee\u494c\u8640::\u88c5\u071d\u3776\u7049\ub102, getfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)))), loadelement:String(getstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7), xor:int(ldc:int(10310), ldc:int(10318))))))
                        putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\uceb8\u392e\u9255\u718f\u6c56, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u64f2\u8350\u0b8e\u64f2\u946b))), mul:double(invokevirtual:double(\u6b5f\u1187\u3e75\u5d20\ud217::\u99f7\ub171\u97e6\u12b2\u600f, invokevirtual:\u6b5f\u1187\u3e75\u5d20\ud217(\u7d52\u7d52\u92ee\u494c\u8640::\u5d20\u446c\u4e72\ua562\u600f, getfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab))), ldc:double(0.0))), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u64f2\u8350\u0b8e\u64f2\u946b))), mul:double(invokevirtual:double(\u6b5f\u1187\u3e75\u5d20\ud217::\u8350\u1187\u6c56\ub32d\u927d, invokevirtual:\u6b5f\u1187\u3e75\u5d20\ud217(\u7d52\u7d52\u92ee\u494c\u8640::\u5d20\u446c\u4e72\ua562\u600f, getfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab))), ldc:double(0.0))), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u64f2\u8350\u0b8e\u64f2\u946b))), mul:double(invokevirtual:double(\u6b5f\u1187\u3e75\u5d20\ud217::\ub7dc\u71f1\uc238\ub19c\u965f, invokevirtual:\u6b5f\u1187\u3e75\u5d20\ud217(\u7d52\u7d52\u92ee\u494c\u8640::\u5d20\u446c\u4e72\ua562\u600f, getfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab))), ldc:double(0.0)))))
                        invokespecial:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u6fb0\ub113\uceb8\u0c95\ua6bd, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)
                        return:void()
                    }
                }
            }
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(67108864)), ldc:int(0))) {
                invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, loadelement:String(getstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7), xor:int(ldc:int(-16380), ldc:int(-16371))))
                invokevirtual:void(\ud158\u839e\u7006\uc3e3\u446c::\u836c\u6198\ua6bd\u071d\u47c2, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab[expected:\ud158\u839e\u7006\uc3e3\u446c])
            }
        }
    }
    
    private void \u8308\ud36e\ufcaf\u9033\u7873(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ufe34\u40a9\ub6ab\u5fe1\u7330 p0) {
        var_2_61 : int
        var_2_6E : int
        var_4_86 : Iterator<\u4f52\u8d90\u965f\u927d\u0a06>
        var_5_C3 : \u4f52\u8d90\u965f\u927d\u0a06
        var_6_FF : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_7_12F : double
        var_9_147 : double
        var_11_15F : double
        var_13_17A : \u4c2b\u965f\u494c\u8753\u7043
        var_4_B0 : Iterator<\u0c95\u97b7\ud523\ub171\u0b8e>
        var_6_1DB : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_7_1F3 : double
        var_9_20B : double
        var_11_223 : double
        var_13_23E : \u4c2b\u965f\u494c\u8753\u7043
        
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
        var_2_61 = and:int(ldc:int(1646372938), ldc:int(1530213998))
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            var_2_6E = and:int(var_2_61:int, ldc:int(1126426474))
            invokestatic:void(GL11::glAlphaFunc, and:int(ldc:int(836), ldc:int(518)), ldc:float(0.0f))
            var_4_86 = invokeinterface:Iterator<\u4f52\u8d90\u965f\u927d\u0a06>(List<\u4f52\u8d90\u965f\u927d\u0a06>::iterator, invokevirtual:List<\u4f52\u8d90\u965f\u927d\u0a06>(\u7d52\u7d52\u92ee\u494c\u8640::\u88c5\u071d\u3776\u7049\ub102, getfield:\u7d52\u7d52\u92ee\u494c\u8640(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u759a\u74b1\u6fb0\u8350\u8308, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_86:Iterator<\u4f52\u8d90\u965f\u927d\u0a06>)) {
                var_5_C3 = checkcast:\u4f52\u8d90\u965f\u927d\u0a06(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4f52\u8d90\u965f\u927d\u0a06.class, invokeinterface:\u4f52\u8d90\u965f\u927d\u0a06(Iterator<\u4f52\u8d90\u965f\u927d\u0a06>::next, var_4_86:Iterator<\u4f52\u8d90\u965f\u927d\u0a06>))
                var_6_FF = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\uceb8\u392e\u9255\u718f\u6c56, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab))), invokevirtual:double(\u6b5f\u1187\u3e75\u5d20\ud217::\u99f7\ub171\u97e6\u12b2\u600f, invokevirtual:\uafe7\ub19c\ubb2b\uc246\ud158[expected:\u6b5f\u1187\u3e75\u5d20\ud217](\u4f52\u8d90\u965f\u927d\u0a06::\u4daf\u836c\u4179\u527a\u3504, var_5_C3:\u4f52\u8d90\u965f\u927d\u0a06))), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\uceb8\u392e\u9255\u718f\u6c56, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab))), invokevirtual:double(\u6b5f\u1187\u3e75\u5d20\ud217::\u8350\u1187\u6c56\ub32d\u927d, invokevirtual:\uafe7\ub19c\ubb2b\uc246\ud158[expected:\u6b5f\u1187\u3e75\u5d20\ud217](\u4f52\u8d90\u965f\u927d\u0a06::\u4daf\u836c\u4179\u527a\u3504, var_5_C3:\u4f52\u8d90\u965f\u927d\u0a06))), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\uceb8\u392e\u9255\u718f\u6c56, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab))), invokevirtual:double(\u6b5f\u1187\u3e75\u5d20\ud217::\ub7dc\u71f1\uc238\ub19c\u965f, invokevirtual:\uafe7\ub19c\ubb2b\uc246\ud158[expected:\u6b5f\u1187\u3e75\u5d20\ud217](\u4f52\u8d90\u965f\u927d\u0a06::\u4daf\u836c\u4179\u527a\u3504, var_5_C3:\u4f52\u8d90\u965f\u927d\u0a06))))
                
                if (cmpeq:boolean(invokestatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u4c2b\u3bd6\u385b\uc7fe\u8640::\u5654\u965f\u873d\ud171\uf995, var_6_FF:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd))) {
                    var_7_12F = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_6_FF:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                    var_9_147 = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_6_FF:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                    var_11_15F = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_6_FF:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                    var_13_17A = initobject:\u4c2b\u965f\u494c\u8753\u7043(\u4c2b\u965f\u494c\u8753\u7043::<init>, var_7_12F:double, var_9_147:double, var_11_15F:double, add:double(var_7_12F:double, ldc:double(1.0)), add:double(var_9_147:double, ldc:double(1.0)), add:double(var_11_15F:double, ldc:double(1.0)))
                    invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u7bad\u718f\u4cd9\u5654\u9255\ub1b9, var_13_17A:\u4c2b\u965f\u494c\u8753\u7043, invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u88c5\u71f1\uc246\u97b7\u74b1)), ldc:float(0.02f)))
                    invokestatic:void(GL11::glEnable, and:int(ldc:int(3879), ldc:int(2864)))
                    invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u3e75\u494c\u8709\ub32d\uc7fe\u93a2, var_13_17A:\u4c2b\u965f\u494c\u8753\u7043, invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u88c5\u71f1\uc246\u97b7\u74b1)), ldc:float(0.03f)))
                    invokestatic:void(GL11::glColor3f, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
                }
                
                var_2_6E = and:int(var_2_6E:int, ldc:int(1195093614))
            }
            
            var_4_B0 = invokeinterface:Iterator<\u0c95\u97b7\ud523\ub171\u0b8e>(List<\u0c95\u97b7\ud523\ub171\u0b8e>::iterator, getfield:List<\u0c95\u97b7\ud523\ub171\u0b8e>(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\ud523\uc246\ub1b9\ud217\u8c8a, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_B0:Iterator<\u0c95\u97b7\ud523\ub171\u0b8e>)) {
                var_6_1DB = getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u0c95\u97b7\ud523\ub171\u0b8e::\u6ec6\u9033\u873d\u8413\u446c, checkcast:\u0c95\u97b7\ud523\ub171\u0b8e(\ub113\ufcaf\u3c25\u071d\u97b7.\u0c95\u97b7\ud523\ub171\u0b8e.class, invokeinterface:\u0c95\u97b7\ud523\ub171\u0b8e(Iterator<\u0c95\u97b7\ud523\ub171\u0b8e>::next, var_4_B0:Iterator<\u0c95\u97b7\ud523\ub171\u0b8e>)))
                var_7_1F3 = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_6_1DB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                var_9_20B = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_6_1DB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                var_11_223 = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_6_1DB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                var_13_23E = initobject:\u4c2b\u965f\u494c\u8753\u7043(\u4c2b\u965f\u494c\u8753\u7043::<init>, var_7_1F3:double, var_9_20B:double, var_11_223:double, add:double(var_7_1F3:double, ldc:double(1.0)), add:double(var_9_20B:double, ldc:double(1.0)), add:double(var_11_223:double, ldc:double(1.0)))
                invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u7bad\u718f\u4cd9\u5654\u9255\ub1b9, var_13_23E:\u4c2b\u965f\u494c\u8753\u7043, invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u67e9\u624e\u7043\u4c2b\ubf56)), ldc:float(0.1f)))
                invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u3e75\u494c\u8709\ub32d\uc7fe\u93a2, var_13_23E:\u4c2b\u965f\u494c\u8753\u7043, invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u67e9\u624e\u7043\u4c2b\ubf56)), ldc:float(0.2f)))
                invokestatic:void(GL11::glColor3f, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            }
        }
    }
    
    static {
        var_0_295 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BC_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_E5_0 : byte[] [generated]
        stack_23D_0 : byte[] [generated]
        stack_2A8_0 : byte[] [generated]
        stack_323_0 : byte[] [generated]
        var_4_21E : int
        var_3_223 : byte[]
        var_5_224 : int
        expr_243 : byte [generated]
        var_0_2C2 : int
        expr_2A8 : byte [generated]
        stack_2F1_2 : byte [generated]
        stack_2C5_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BC : byte[]
        expr_C0 : int [generated]
        var_3_311 : byte[]
        var_5_312 : int
        var_3_F1 : String
        stack_217_0 : String[] [generated]
        expr_103 : String[] [generated]
        
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
        var_0_295 = and:int(ldc:int(-1802561063), ldc:int(-538747481))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_23D_0 = stack_2A8_0 = stack_323_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Q48qKSkqrM8HL62wowXKr6ouLsioqCaLhCgwLyvDT6YuqwIoMC8rJMGmLqsCGCgtKShLlqqlKamNwq0rpCWpKSKurRXFpqUlFkAsJxWlvqeoJzKoJourrSKwBEoio4arzy2rJ7ivp6InIrguqxIloqKspCCjJgIqKcOoAVCvrawnRKioJqsiqyesLbAuq/JfWdJdWgI=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_21E = expr_6E:int
        var_3_223 = newarray:byte[](byte.class, expr_6E:int)
        var_5_224 = expr_6E:int
        Label_0550:
        
        while (cmpne:boolean(and:int(var_0_295:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(-1645504590))
            var_5_224 = add:int(var_5_224:int, ldc:int(-1))
            expr_243 = xor:byte(add:byte(loadelement:byte(stack_23D_0:byte[], var_5_224:int), ldc:byte(15)), ldc:byte(56))
            storeelement:byte(var_3_223:byte[], var_5_224:int, or:int(and:int(shl:int(expr_243:byte, xor:int(ldc:int(2586), ldc:int(2590))), ldc:int(-16)), and:int(shr:int(expr_243:byte[expected:int], and:int(ldc:int(2567), ldc:int(16700))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_224:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_23D_0 = stack_2A8_0 = stack_323_0 = var_3_223:byte[]
            goto(Label_0115)
        }
        
        Label_0648:
        
        while (cmpne:boolean(and:int(var_0_295:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_2C2 = and:int(var_0_295:int, ldc:int(-1661240066))
            var_5_224 = add:int(var_5_224:int, ldc:int(-1))
            expr_2A8 = stack_2F1_2 = loadelement(stack_2A8_0, var_5_224)
            
            if (cmplt:boolean(add:int(add:int(var_5_224:int, ldc:int(6)), neg:int(var_4_21E:int)), ldc:int(0))) {
                stack_2F1_2 = stack_2C5_0 = add:byte(expr_2A8:byte, loadelement:byte(var_3_223:byte[], add:int(var_5_224:int, ldc:int(6))))
                goto(Label_0725)
            }
            
            Label_0693:
            
            if (cmpne:boolean(and:int(var_0_2C2:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_2C2 = and:int(var_0_2C2:int, ldc:int(-1080569166))
                stack_2F1_2 = stack_2C5_0 = add:byte(expr_2A8:byte, ldc:byte(6))
            }
            
            Label_0725:
            
            if (cmpeq:boolean(and:int(var_0_2C2:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_2C2 = and:int(var_0_2C2:int, ldc:int(1242932468))
                goto(Label_0693)
            }
            
            var_0_295 = and:int(var_0_2C2:int, ldc:int(-1227727128))
            storeelement:byte(var_3_223:byte[], var_5_224:int, stack_2F1_2:byte)
            
            if (cmpne:boolean(var_5_224:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_23D_0 = stack_2A8_0 = stack_323_0 = var_3_223:byte[]
            goto(Label_0155)
        }
        
        var_0_295 = and:int(var_0_295:int, ldc:int(1626881696))
        goto(Label_0550)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_295:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(1907957364))
            goto(Label_0197)
        }
        
        if (cmpne:boolean(and:int(var_0_295:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(-1227186791))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_21E = expr_96:int
                var_3_223 = newarray:byte[](byte.class, expr_96:int)
                var_5_224 = expr_96:int
                goto(Label_0648)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_295:int, ldc:int(128)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_295:int, ldc:int(8192)), ldc:int(0))) {
                var_0_295 = and:int(var_0_295:int, ldc:int(74027207))
                goto(Label_0115)
            }
            
            var_0_295 = and:int(var_0_295:int, ldc:int(-1635010613))
            var_2_BC = stack_BC_0:byte[]
            expr_C0 = add:int(arraylength:int(stack_BE_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                var_3_311 = newarray:byte[](byte.class, expr_C0:int)
                var_5_312 = expr_C0:int
                
                loop {
                    var_0_295 = and:int(var_0_295:int, ldc:int(-1647349367))
                    var_5_312 = add:int(var_5_312:int, ldc:int(-1))
                    storeelement:byte(var_3_311:byte[], var_5_312:int, add:int(shl:int(loadelement:byte(stack_323_0:byte[], var_5_312:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_BC:byte[], add:int(var_5_312:int, xor:int(ldc:int(-16252), ldc:int(-16251)))), ldc:int(3)), xor:int(ldc:int(1164), ldc:int(1171)))))
                    
                    if (cmpne:boolean(var_5_312:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_23D_0 = stack_2A8_0 = stack_323_0 = var_3_311:byte[]
            }
        }
        
        Label_0197:
        
        if (cmpne:boolean(and:int(var_0_295:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(-1318168346))
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_F1 = initobject:String(String::<init>, stack_E5_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_217_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(3203), ldc:int(3209)))
            expr_103 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4438), ldc:int(4444)))
            storeelement:String(expr_103:String[], and:int(ldc:int(8217), ldc:int(5416)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(-32011), ldc:int(27914)), xor:int(ldc:int(-32640), ldc:int(-32611))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(-31484), ldc:int(-31481)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(6192), ldc:int(6189)), xor:int(ldc:int(5156), ldc:int(5178))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(16977), ldc:int(16979)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(4127), ldc:int(1054)), xor:int(ldc:int(127), ldc:int(87))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(-24304), ldc:int(-24298)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(27160), ldc:int(27184)), xor:int(ldc:int(16455), ldc:int(16500))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(2696), ldc:int(2697)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(307), ldc:int(16955)), xor:int(ldc:int(9016), ldc:int(9073))))
            storeelement:String(expr_103:String[], and:int(ldc:int(-6595), ldc:int(6530)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(626), ldc:int(571)), xor:int(ldc:int(-31645), ldc:int(-31695))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(7428), ldc:int(7427)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(16506), ldc:int(594)), xor:int(ldc:int(2324), ldc:int(2430))))
            storeelement:String(expr_103:String[], and:int(ldc:int(16389), ldc:int(10092)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(762), ldc:int(24686)), and:int(ldc:int(20599), ldc:int(123))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(16904), ldc:int(16897)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-28050), ldc:int(-28131)), xor:int(ldc:int(24712), ldc:int(24579))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(17546), ldc:int(17551)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(16783), ldc:int(8363)), xor:int(ldc:int(12343), ldc:int(12451))))
            putstatic:String[](\u64f2\ua3b4\ud4fe\u6bb9\u64ab::\u67e9\u960f\uf9c5\u3bc9\uafe7, expr_103:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A8 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6B3 : int
        
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
        var_3_6A8 = and:int(ldc:int(-1244028551), ldc:int(1467563881))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u64f2\ua3b4\ud4fe\u6bb9\u64ab[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-171054097))
            var_5_81 = and:int(ldc:int(27674), ldc:int(-27675))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8862), ldc:int(-10911)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6A8:int, ldc:int(1030601651))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(18432), ldc:int(18433)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(3072), ldc:int(3073)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6A8 = and:int(var_3_D1:int, ldc:int(-1076026397))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(9985), ldc:int(16457)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(4563547))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-119565631))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1881424131))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(7810300))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-699724588))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(48412983))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(2113483119))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(227952565))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(822150637))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(957537278))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(897559985))
                            var_11_E2 = and:int(ldc:int(23202), ldc:int(-23211))
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1794422726))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-517843141))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1036422296))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1599733629))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1331623365))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(263945593))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-2003460604))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1488763682))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-489821364))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(324716398))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(2111651239))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1919821038))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1380623453))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1197139515))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(806751133))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(452989165))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1956659604))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(394099119))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(8193), ldc:int(4201))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-961272294))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1626531146))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-434308340))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1569341260))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-545739412))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1476230567))
                        var_11_E2 = and:int(ldc:int(-7541), ldc:int(3444))
                    }
                    
                    Label_1155:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1500794065))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1722417058))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1325673889))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(533458745))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1155)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-2036041043))
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1351681387))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1214895175))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1608462181))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1544)
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(721549325))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(300521119))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-2066023877))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(931937193))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1247787598))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6A8 = and:int(var_3_6A8:int, ldc:int(2101983589))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B3 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-475749530))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1369450888))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-363421067))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(861215579))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(370873614))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(605193779))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(594984525))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1746277963))
                        var_17_6B3 = add:int(var_16_110:int, xor:int(ldc:int(132), ldc:int(133)))
                        looporswitchbreak()
                    }
                    
                    var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1397124228))
                }
                
                var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1072669055))
                
                if (cmple:boolean(var_5_81 = var_17_6B3:int, sub:int(var_6_88:int, xor:int(ldc:int(20480), ldc:int(20481))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
