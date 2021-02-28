public abstract class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub83f\uf995\u5245\u5bc4\u3e75<T> {
    public void \ub83f\uf995\u5245\u5bc4\u3e75() {
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
            invokespecial:\u946b\u16f6\ubefe\u76bc\uae87(\u946b\u16f6\ubefe\u76bc\uae87::<init>, this:\ub83f\uf995\u5245\u5bc4\u3e75<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5bc4\u983f\ua3b4\u5fe1\u7d52\u946b(com.google.gson.JsonObject p0, T extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u3d4b\ucef1\u4ab3\ud158\u88c5 p1, com.google.gson.JsonSerializationContext p2) {
        var_4_61 : int
        
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
            var_4_61 = and:int(ldc:int(-1973619162), ldc:int(-859834719))
            
            if (cmpne:boolean(getfield:int(\u3d4b\ucef1\u4ab3\ud158\u88c5::\ub18d\u3711\u67e9\u88c5\u0a06\u8753, p1:T extends \u3d4b\ucef1\u4ab3\ud158\u88c5[expected:\u3d4b\ucef1\u4ab3\ud158\u88c5]), xor:int(ldc:int(16896), ldc:int(16897)))) {
                invokevirtual:void(JsonObject::addProperty, p0:JsonObject, ldc:String("weight"), invokestatic:Integer[expected:Number](Integer::valueOf, getfield:int(\u3d4b\ucef1\u4ab3\ud158\u88c5::\ub18d\u3711\u67e9\u88c5\u0a06\u8753, p1:T extends \u3d4b\ucef1\u4ab3\ud158\u88c5[expected:\u3d4b\ucef1\u4ab3\ud158\u88c5])))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-707977658))
                }
                else {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-1065748889))
                    
                    if (cmpne:boolean(getfield:int(\u3d4b\ucef1\u4ab3\ud158\u88c5::\u92ff\u71ae\u72f1\u6435\u6bb9\ud217, p1:T extends \u3d4b\ucef1\u4ab3\ud158\u88c5[expected:\u3d4b\ucef1\u4ab3\ud158\u88c5]), ldc:int(0))) {
                        invokevirtual:void(JsonObject::addProperty, p0:JsonObject, ldc:String("quality"), invokestatic:Integer[expected:Number](Integer::valueOf, getfield:int(\u3d4b\ucef1\u4ab3\ud158\u88c5::\u92ff\u71ae\u72f1\u6435\u6bb9\ud217, p1:T extends \u3d4b\ucef1\u4ab3\ud158\u88c5[expected:\u3d4b\ucef1\u4ab3\ud158\u88c5])))
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (logicalnot:boolean(invokestatic:boolean(ArrayUtils::isEmpty, checkcast:\uf9c5\u7d52\u839e\u16f6\u4492[][expected:Object[]](\u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492[].class, getfield:\uf9c5\u7d52\u839e\u16f6\u4492[][expected:Object[]](\u3d4b\ucef1\u4ab3\ud158\u88c5::\uae87\u9937\u6bb9\uc910\uc84e\u4ab3, p1:T extends \u3d4b\ucef1\u4ab3\ud158\u88c5[expected:\u3d4b\ucef1\u4ab3\ud158\u88c5]))))) {
                invokevirtual:void(JsonObject::add, p0:JsonObject, ldc:String("functions"), invokeinterface:JsonElement(JsonSerializationContext::serialize, p2:JsonSerializationContext, getfield:\uf9c5\u7d52\u839e\u16f6\u4492[][expected:Object](\u3d4b\ucef1\u4ab3\ud158\u88c5::\uae87\u9937\u6bb9\uc910\uc84e\u4ab3, p1:T extends \u3d4b\ucef1\u4ab3\ud158\u88c5[expected:\u3d4b\ucef1\u4ab3\ud158\u88c5])))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final T extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u3d4b\ucef1\u4ab3\ud158\u88c5 \uae5d\uc87f\u34df\ud4fe\u8d90\u120d(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p2) {
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
            return:T extends \u3d4b\ucef1\u4ab3\ud158\u88c5(invokevirtual:T extends \u3d4b\ucef1\u4ab3\ud158\u88c5(\ub83f\uf995\u5245\u5bc4\u3e75<T>::\ub70c\u839e\u3e2a\u34df\ub19c\u7330, this:\ub83f\uf995\u5245\u5bc4\u3e75<T>, p0:JsonObject, p1:JsonDeserializationContext, invokestatic:int(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u4e72\u4f4a\u6c52\u446c\u97b7\uae5d, p0:JsonObject, ldc:String("weight"), xor:int(ldc:int(1080), ldc:int(1081))), invokestatic:int(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u4e72\u4f4a\u6c52\u446c\u97b7\uae5d, p0:JsonObject, ldc:String("quality"), and:int(ldc:int(-19898), ldc:int(19897))), p2:\u67d0\u36d3\uae5d\u99f7\u9a18[], checkcast:\uf9c5\u7d52\u839e\u16f6\u4492[](\u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492[].class, invokestatic:\uf9c5\u7d52\u839e\u16f6\u4492[](\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\ub83f\uae5d\u7330\u7873\u7ce1\u516c, p0:JsonObject, ldc:String("functions"), newarray:\uf9c5\u7d52\u839e\u16f6\u4492[](\u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492.class, and:int(ldc:int(4649), ldc:int(-4650))), p1:JsonDeserializationContext, ldc:Class<\uf9c5\u7d52\u839e\u16f6\u4492[]>(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492[].class)))))
        }
        
        goto(Label_0006)
    }
    
    public abstract T extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u3d4b\ucef1\u4ab3\ud158\u88c5 \ub70c\u839e\u3e2a\u34df\ub19c\u7330(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1, int p2, int p3, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p4, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492[] p5);
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\uf94d\ub18d\u34df\u59ec\u446c \uae5d\uc87f\u34df\ud4fe\u8d90\u120d(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p2) {
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
            return:\uf94d\ub18d\u34df\u59ec\u446c(invokevirtual:\uf94d\ub18d\u34df\u59ec\u446c(\ub83f\uf995\u5245\u5bc4\u3e75<\uf94d\ub18d\u34df\u59ec\u446c>::\uae5d\uc87f\u34df\ud4fe\u8d90\u120d, this:\ub83f\uf995\u5245\u5bc4\u3e75<T>, p0:JsonObject, p1:JsonDeserializationContext, p2:\u67d0\u36d3\uae5d\u99f7\u9a18[]))
        }
        
        goto(Label_0006)
    }
    
    public void \u5bc4\u983f\ua3b4\u5fe1\u7d52\u946b(com.google.gson.JsonObject p0, \u6435\ub8be\u718f\u6b0d\u67e9.\uf94d\ub18d\u34df\u59ec\u446c p1, com.google.gson.JsonSerializationContext p2) {
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
            invokevirtual:void(\ub83f\uf995\u5245\u5bc4\u3e75<\u3d4b\ucef1\u4ab3\ud158\u88c5>::\u5bc4\u983f\ua3b4\u5fe1\u7d52\u946b, this:\ub83f\uf995\u5245\u5bc4\u3e75<T>, p0:JsonObject, checkcast:\u3d4b\ucef1\u4ab3\ud158\u88c5(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u3d4b\ucef1\u4ab3\ud158\u88c5.class, p1:\uf94d\ub18d\u34df\u59ec\u446c[expected:\u3d4b\ucef1\u4ab3\ud158\u88c5]), p2:JsonSerializationContext)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5fe1\u0b8e\u64f2\ud158\uc29a\u385b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_621 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_62C : int
        
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
        var_3_621 = and:int(ldc:int(-59388594), ldc:int(-1133119522))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub83f\uf995\u5245\u5bc4\u3e75<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1024)), ldc:int(0))) {
            var_3_621 = and:int(var_3_621:int, ldc:int(2139289021))
        }
        else {
            var_3_621 = and:int(var_3_621:int, ldc:int(-187314737))
            var_5_85 = and:int(ldc:int(25700), ldc:int(-26232))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25776), ldc:int(25767)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_621:int, ldc:int(-59384481))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(22544), ldc:int(22545)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(8327), ldc:int(16657)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_621 = and:int(var_3_D2:int, ldc:int(-732569745))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(12801), ldc:int(19475)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1401107246))
                        goto(Label_1281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1450361736))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(727277032))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1233133697))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1092945284))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(861232018))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-613775541))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(843761841))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-581057041))
                            var_11_E3 = and:int(ldc:int(-7372), ldc:int(6339))
                            goto(Label_1436)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1981971462))
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-2127356455))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-272188862))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1200093336))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-406119012))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-680145633))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(564130615))
                        goto(Label_1281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-207075371))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-170003073))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1093289727))
                        goto(Label_1281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(482483551))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(489142238))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(763094652))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1082210623))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(532939471))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-562571361))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(18624), ldc:int(18625))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(710719465))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(2044254231))
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-122853626))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(675424516))
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1920786964))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1840703455))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1851110268))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(2110137653))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-159522882))
                        var_11_E3 = and:int(ldc:int(-10910), ldc:int(10893))
                    }
                    
                    Label_1059:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(9755013))
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(252937270))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(59241532))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1772098274))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1281)
                            }
                        }
                    }
                    
                    Label_1163:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(794088298))
                            goto(Label_1059)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1944104059))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(2070714125))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-162140402))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1436)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1281:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1469501828))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1392428750))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(23760872))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-518551996))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1965996262))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(2042989476))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(75726392))
                        loopcontinue()
                    }
                    
                    var_3_621 = and:int(var_3_621:int, ldc:int(-707270705))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1436:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62C = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1447:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-347701415))
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-951837617))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-347460869))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(371513051))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(959878459))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-167784449))
                        var_17_62C = add:int(var_16_111:int, and:int(ldc:int(33), ldc:int(5)))
                        looporswitchbreak()
                    }
                    
                    var_3_621 = and:int(var_3_621:int, ldc:int(500708832))
                }
                
                var_3_621 = and:int(var_3_621:int, ldc:int(-539101362))
                
                if (cmple:boolean(var_5_85 = var_17_62C:int, sub:int(var_6_8C:int, and:int(ldc:int(2051), ldc:int(13837))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
