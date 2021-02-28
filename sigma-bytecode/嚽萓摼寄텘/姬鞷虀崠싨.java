public class \u56bd\u8413\u647c\u5bc4\ud158.\u59ec\u97b7\u8640\u5d20\uc2e8 {
    public void \u59ec\u97b7\u8640\u5d20\uc2e8(java.util.function.LongSupplier p0, java.util.function.IntSupplier p1, boolean p2) {
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
            invokespecial:Object(Object::<init>, this:\u59ec\u97b7\u8640\u5d20\uc2e8)
            putfield:List<String>(\u59ec\u97b7\u8640\u5d20\uc2e8::\u3bc9\ud523\ub83f\u3a62\u12cb\u965f, this:\u59ec\u97b7\u8640\u5d20\uc2e8, invokestatic:ArrayList[expected:List<String>](Lists::newArrayList))
            putfield:LongList(\u59ec\u97b7\u8640\u5d20\uc2e8::\u8bb0\u5db4\uf94d\u9a18\ud12e\u7e3f, this:\u59ec\u97b7\u8640\u5d20\uc2e8, initobject:LongArrayList[expected:LongList](LongArrayList::<init>))
            putfield:Map<String, \uafe7\u3a62\u965f\u3504\ud523>(\u59ec\u97b7\u8640\u5d20\uc2e8::\u5f50\u16f6\u6d99\u52d3\u647c\ua6bd, this:\u59ec\u97b7\u8640\u5d20\uc2e8, invokestatic:HashMap[expected:Map<String, \uafe7\u3a62\u965f\u3504\ud523>](Maps::newHashMap))
            putfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8, loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), and:int(ldc:int(-6709), ldc:int(6708))))
            putfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, this:\u59ec\u97b7\u8640\u5d20\uc2e8, and:int[expected:boolean](ldc:int(4842), ldc:int(-7148)))
            putfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\ubff1\u5140\u965f\ub1b9\u6ec6\u960f, this:\u59ec\u97b7\u8640\u5d20\uc2e8, and:int[expected:boolean](ldc:int(-1083), ldc:int(1082)))
            putfield:long(\u59ec\u97b7\u8640\u5d20\uc2e8::\uc910\u960f\u92ee\u8c8a\u71ae\u3c25, this:\u59ec\u97b7\u8640\u5d20\uc2e8, invokeinterface:long(LongSupplier::getAsLong, p0:LongSupplier))
            putfield:LongSupplier(\u59ec\u97b7\u8640\u5d20\uc2e8::\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9, this:\u59ec\u97b7\u8640\u5d20\uc2e8, p0:LongSupplier)
            putfield:int(\u59ec\u97b7\u8640\u5d20\uc2e8::\ua068\u392e\u3d64\u5db4\uc87f\u4c04, this:\u59ec\u97b7\u8640\u5d20\uc2e8, invokeinterface:int(IntSupplier::getAsInt, p1:IntSupplier))
            putfield:IntSupplier(\u59ec\u97b7\u8640\u5d20\uc2e8::\u120d\u446c\uff55\u3d64\u494c\u69d9, this:\u59ec\u97b7\u8640\u5d20\uc2e8, p1:IntSupplier)
            putfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, this:\u59ec\u97b7\u8640\u5d20\uc2e8, p2:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucef1\u8258\u446c\u760c\u1833\u36d3() {
        var_1_85 : int
        var_3_6C : \u56bd\u6b0d\u3711\ub18d\u12b2
        stack_103_0 : \u59ec\u97b7\u8640\u5d20\uc2e8 [generated]
        stack_BE_0 : \u59ec\u97b7\u8640\u5d20\uc2e8 [generated]
        stack_103_1 : int [generated]
        stack_BE_1 : int [generated]
        var_1_102 : int
        
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
        var_1_85 = and:int(ldc:int(-1212458887), ldc:int(939384047))
        var_3_6C = checkcast:\u56bd\u6b0d\u3711\ub18d\u12b2(\u494c\u4975\ua068\u0c95\uc84e.\u56bd\u6b0d\u3711\ub18d\u12b2.class, invokestatic:Object[expected:\u56bd\u6b0d\u3711\ub18d\u12b2](\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u416d\ud158\ud36e\u4c2b\u5db4\u8308, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1[expected:Object](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350), getstatic:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u59ec\u97b7\u8640\u5d20\uc2e8::\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)))
        stack_103_0 = this:\u59ec\u97b7\u8640\u5d20\uc2e8
        stack_BE_0 = this:\u59ec\u97b7\u8640\u5d20\uc2e8
        
        if (cmpne:boolean(var_3_6C:\u56bd\u6b0d\u3711\ub18d\u12b2, aconstnull:\u56bd\u6b0d\u3711\ub18d\u12b2())) {
            if (cmpeq:boolean(invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\u56bd\u6b0d\u3711\ub18d\u12b2::\u67d0\u6198\ub83f\u0c95\u392e\u7049, var_3_6C:\u56bd\u6b0d\u3711\ub18d\u12b2), this:\u59ec\u97b7\u8640\u5d20\uc2e8[expected:\ubf56\u64f2\u392e\u98a4\u120d])) {
                stack_103_1 = stack_BE_1 = xor(ldc(514), ldc(515))
                goto(Label_0170)
            }
        }
        
        Label_0114:
        
        if (cmpne:boolean(and:int(var_1_85:int, ldc:int(2)), ldc:int(0))) {
            var_1_85 = and:int(var_1_85:int, ldc:int(1073560195))
            goto(Label_0201)
        }
        
        var_1_85 = and:int(var_1_85:int, ldc:int(-415524497))
        stack_103_1 = stack_BE_1 = and(ldc(-27357), ldc(27340))
        Label_0170:
        
        if (cmpne:boolean(and:int(var_1_85:int, ldc:int(128)), ldc:int(0))) {
            var_1_85 = and:int(var_1_85:int, ldc:int(-458380025))
            goto(Label_0247)
        }
        
        var_1_85 = and:int(var_1_85:int, ldc:int(1069382399))
        putfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, stack_BE_0:\u59ec\u97b7\u8640\u5d20\uc2e8, stack_BE_1:boolean)
        stack_103_0 = this:\u59ec\u97b7\u8640\u5d20\uc2e8
        stack_BE_0 = this:\u59ec\u97b7\u8640\u5d20\uc2e8
        
        if (getfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, this:\u59ec\u97b7\u8640\u5d20\uc2e8)) {
            if (invokestatic:boolean(\uae87\ubded\ud51e\u4f52\u6c56\ua61f::\u5db4\u8d98\u8350\u3504\ub113\u516c)) {
                stack_103_1 = stack_BE_1 = xor(ldc(9236), ldc(9237))
                goto(Label_0247)
            }
        }
        
        Label_0201:
        
        if (cmpne:boolean(and:int(var_1_85:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0114)
        }
        
        var_1_85 = and:int(var_1_85:int, ldc:int(2008906093))
        stack_103_1 = stack_BE_1 = and(ldc(-4775), ldc(678))
        Label_0247:
        
        if (cmpeq:boolean(and:int(var_1_85:int, ldc:int(1024)), ldc:int(0))) {
            var_1_102 = and:int(var_1_85:int, ldc:int(1069357643))
            putfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\ubff1\u5140\u965f\ub1b9\u6ec6\u960f, stack_103_0:\u59ec\u97b7\u8640\u5d20\uc2e8, stack_103_1:boolean)
            
            if (logicalnot:boolean(getfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\u7ce1\u516c\uc238\u7d52\u6ec6\u8308, this:\u59ec\u97b7\u8640\u5d20\uc2e8))) {
                var_1_102 = and:int(var_1_102:int, ldc:int(-1082320165))
                putfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\u7ce1\u516c\uc238\u7d52\u6ec6\u8308, this:\u59ec\u97b7\u8640\u5d20\uc2e8, xor:int[expected:boolean](ldc:int(652), ldc:int(653)))
                putfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8, loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), and:int(ldc:int(21848), ldc:int(-21849))))
                invokeinterface:void(List<E>::clear, getfield:List<String>(\u59ec\u97b7\u8640\u5d20\uc2e8::\u3bc9\ud523\ub83f\u3a62\u12cb\u965f, this:\u59ec\u97b7\u8640\u5d20\uc2e8))
                invokevirtual:void(\u59ec\u97b7\u8640\u5d20\uc2e8::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, this:\u59ec\u97b7\u8640\u5d20\uc2e8, loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), and:int(ldc:int(9498), ldc:int(162))))
            }
            else {
                invokeinterface:void(Logger::error, getstatic:Logger(\u59ec\u97b7\u8640\u5d20\uc2e8::\u36d3\uc4d2\u3504\u183a\uf94d\u6bb9), loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), and:int(ldc:int(29571), ldc:int(2149))))
            }
            
            return:void()
        }
        
        goto(Label_0170)
    }
    
    public void \u8aa5\ufcaf\u64f2\ua562\ubefe\u69d9() {
        var_1_5F : int
        stack_D0_0 : Logger [generated]
        stack_D0_1 : String [generated]
        expr_BE : Supplier[] [generated]
        
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
            var_1_5F = and:int(ldc:int(-759984011), ldc:int(-709099949))
            
            if (getfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\u7ce1\u516c\uc238\u7d52\u6ec6\u8308, this:\u59ec\u97b7\u8640\u5d20\uc2e8)) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-84411587))
                invokevirtual:void(\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, this:\u59ec\u97b7\u8640\u5d20\uc2e8)
                putfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\u7ce1\u516c\uc238\u7d52\u6ec6\u8308, this:\u59ec\u97b7\u8640\u5d20\uc2e8, and:int[expected:boolean](ldc:int(-20735), ldc:int(4318)))
                
                if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, getfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8)))) {
                    stack_D0_0 = getstatic:Logger(\u59ec\u97b7\u8640\u5d20\uc2e8::\u36d3\uc4d2\u3504\u183a\uf94d\u6bb9)
                    stack_D0_1 = loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), xor:int(ldc:int(2340), ldc:int(2336)))
                    expr_BE = newarray:Supplier[](org.apache.logging.log4j.util.Supplier.class, xor:int(ldc:int(2193), ldc:int(2192)))
                    storeelement:Supplier(expr_BE:Supplier[], and:int(ldc:int(20586), ldc:int(-20587)), invokedynamic:Supplier(get:(L\u56bd\u8413\u647c\u5bc4\ud158/\u59ec\u97b7\u8640\u5d20\uc2e8;)Lorg/apache/logging/log4j/util/Supplier;, this:\u59ec\u97b7\u8640\u5d20\uc2e8))
                    invokeinterface:void(Logger::error, stack_D0_0:Logger, stack_D0_1:String, expr_BE:Supplier[])
                }
            }
            else {
                invokeinterface:void(Logger::error, getstatic:Logger(\u59ec\u97b7\u8640\u5d20\uc2e8::\u36d3\uc4d2\u3504\u183a\uf94d\u6bb9), loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), xor:int(ldc:int(4225), ldc:int(4226))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a(java.lang.String p0) {
        var_2_79 : int
        var_4_105 : int
        
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
            var_2_79 = and:int(ldc:int(626563036), ldc:int(1769682268))
            
            if (getfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\ubff1\u5140\u965f\ub1b9\u6ec6\u960f, this:\u59ec\u97b7\u8640\u5d20\uc2e8)) {
                var_4_105 = invokevirtual:int(String::hashCode, p0:String)
                
                if (logicaland:boolean(cmpeq:boolean(var_4_105:int, getstatic:int(\u59ec\u97b7\u8640\u5d20\uc2e8::\u3e2a\ua61f\uc31c\ua068\ud7e8\ub171)), invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), and:int(ldc:int(4431), ldc:int(8325)))))) {
                    invokevirtual:void(\u92ff\ube23\u3bc9\uc238\u47c2\u8350::\u4bc8\u4e72\ucb79\ub32d\u446c\u7043, getstatic:\u92ff\ube23\u3bc9\uc238\u47c2\u8350(\uae87\ubded\ud51e\u4f52\u6c56\ua61f::\u5db4\u0800\u36d3\u5654\uc9f6\u3dd3))
                }
                else {
                    var_2_79 = and:int(var_2_79:int, ldc:int(-352723466))
                    
                    if (cmpeq:boolean(var_4_105:int, getstatic:int(\u59ec\u97b7\u8640\u5d20\uc2e8::\ubf56\u16f6\u0b8e\u946b\ud158\u759a))) {
                        if (invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), and:int(ldc:int(655), ldc:int(20486))))) {
                            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u5d20\ubff1\u40a9\uc238\ubded\u8258)) {
                                invokevirtual:void(\u92ff\ube23\u3bc9\uc238\u47c2\u8350::\u3dd3\u1833\u759a\u47c2\uc2bd\uc246, getstatic:\u92ff\ube23\u3bc9\uc238\u47c2\u8350(\uae87\ubded\ud51e\u4f52\u6c56\ua61f::\u5db4\u0800\u36d3\u5654\uc9f6\u3dd3))
                                invokevirtual:void(\u92ff\ube23\u3bc9\uc238\u47c2\u8350::\u4bc8\u4e72\ucb79\ub32d\u446c\u7043, getstatic:\u92ff\ube23\u3bc9\uc238\u47c2\u8350(\uae87\ubded\ud51e\u4f52\u6c56\ua61f::\u16f6\u3c25\u4179\u12cb\u3e75\uceb8))
                            }
                        }
                    }
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_2_79:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0166)
                }
                
                if (cmpne:boolean(and:int(var_2_79:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_79 = and:int(var_2_79:int, ldc:int(620436949))
                    
                    if (logicalnot:boolean(getfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\u7ce1\u516c\uc238\u7d52\u6ec6\u8308, this:\u59ec\u97b7\u8640\u5d20\uc2e8))) {
                        invokeinterface:void(Logger::error, getstatic:Logger(\u59ec\u97b7\u8640\u5d20\uc2e8::\u36d3\uc4d2\u3504\u183a\uf94d\u6bb9), loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), and:int(ldc:int(7), ldc:int(12423))), p0:String[expected:Object])
                        looporswitchbreak()
                    }
                }
                
                Label_0129:
                
                if (cmpne:boolean(and:int(var_2_79:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_79:int, ldc:int(1)), ldc:int(0))) {
                        var_2_79 = and:int(var_2_79:int, ldc:int(-1368137374))
                        loopcontinue()
                    }
                    
                    var_2_79 = and:int(var_2_79:int, ldc:int(863674320))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, getfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8)))) {
                        putfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8)), ldc:char(30))))
                    }
                }
                
                Label_0166:
                
                if (cmpne:boolean(and:int(var_2_79:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0129)
                }
                
                if (cmpne:boolean(and:int(var_2_79:int, ldc:int(4096)), ldc:int(0))) {
                    putfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8)), p0:String)))
                    invokeinterface:boolean(List<String>::add, getfield:List<String>(\u59ec\u97b7\u8640\u5d20\uc2e8::\u3bc9\ud523\ub83f\u3a62\u12cb\u965f, this:\u59ec\u97b7\u8640\u5d20\uc2e8), getfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8))
                    invokeinterface:boolean(LongList::add, getfield:LongList(\u59ec\u97b7\u8640\u5d20\uc2e8::\u8bb0\u5db4\uf94d\u9a18\ud12e\u7e3f, this:\u59ec\u97b7\u8640\u5d20\uc2e8), invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u4f4a\u5140\u6b5f\uc910\u983f\u0b8e))
                    putfield:\uafe7\u3a62\u965f\u3504\ud523(\u59ec\u97b7\u8640\u5d20\uc2e8::\u7e3f\u7c6b\ud217\u8258\ud7e8\u7d52, this:\u59ec\u97b7\u8640\u5d20\uc2e8, aconstnull:\uafe7\u3a62\u965f\u3504\ud523())
                    looporswitchbreak()
                }
                
                var_2_79 = and:int(var_2_79:int, ldc:int(1633207008))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a(java.util.function.Supplier<java.lang.String> p0) {
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
            invokevirtual:void(\u59ec\u97b7\u8640\u5d20\uc2e8::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, this:\u59ec\u97b7\u8640\u5d20\uc2e8, checkcast:String(java.lang.String.class, invokeinterface:String(Supplier<String>::get, p0:Supplier<String>)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u61a4\u4c04\uf995\uc31c\u4ab3\u6d69() {
        var_1_10A : int
        var_1_99 : int
        var_3_9D : long
        var_5_B8 : long
        var_7_D9 : long
        var_9_DF : \uafe7\u3a62\u965f\u3504\ud523
        stack_1BD_0 : Logger [generated]
        stack_1BD_1 : String [generated]
        expr_19B : Supplier[] [generated]
        stack_1D4_1 : String [generated]
        
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
            var_1_10A = and:int(ldc:int(-1616539563), ldc:int(2143002741))
            
            if (getfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\u7ce1\u516c\uc238\u7d52\u6ec6\u8308, this:\u59ec\u97b7\u8640\u5d20\uc2e8)) {
                do {
                    if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(4)), ldc:int(0))) {
                        var_1_10A = and:int(var_1_10A:int, ldc:int(2021809457))
                    }
                    else {
                        var_1_10A = and:int(var_1_10A:int, ldc:int(-1615758443))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(LongList::isEmpty, getfield:LongList(\u59ec\u97b7\u8640\u5d20\uc2e8::\u8bb0\u5db4\uf94d\u9a18\ud12e\u7e3f, this:\u59ec\u97b7\u8640\u5d20\uc2e8)))) {
                            loopcontinue()
                        }
                        
                        invokeinterface:void(Logger::error, getstatic:Logger(\u59ec\u97b7\u8640\u5d20\uc2e8::\u36d3\uc4d2\u3504\u183a\uf94d\u6bb9), loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), xor:int(ldc:int(582), ldc:int(591))))
                        return:void()
                    }
                } while (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8192)), ldc:int(0)))
                
                var_1_99 = and:int(var_1_10A:int, ldc:int(1606388607))
                var_3_9D = invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u4f4a\u5140\u6b5f\uc910\u983f\u0b8e)
                var_5_B8 = invokeinterface:long(LongList::removeLong, getfield:LongList(\u59ec\u97b7\u8640\u5d20\uc2e8::\u8bb0\u5db4\uf94d\u9a18\ud12e\u7e3f, this:\u59ec\u97b7\u8640\u5d20\uc2e8), sub:int(invokeinterface:int(LongList::size, getfield:LongList(\u59ec\u97b7\u8640\u5d20\uc2e8::\u8bb0\u5db4\uf94d\u9a18\ud12e\u7e3f, this:\u59ec\u97b7\u8640\u5d20\uc2e8)), xor:int(ldc:int(3), ldc:int(2))))
                invokeinterface:String(List<String>::remove, getfield:List<String>(\u59ec\u97b7\u8640\u5d20\uc2e8::\u3bc9\ud523\ub83f\u3a62\u12cb\u965f, this:\u59ec\u97b7\u8640\u5d20\uc2e8), sub:int(invokeinterface:int(List<E>::size, getfield:List<String>(\u59ec\u97b7\u8640\u5d20\uc2e8::\u3bc9\ud523\ub83f\u3a62\u12cb\u965f, this:\u59ec\u97b7\u8640\u5d20\uc2e8)), xor:int(ldc:int(4628), ldc:int(4629))))
                var_7_D9 = sub:long(var_3_9D:long, var_5_B8:long)
                var_9_DF = invokespecial:\uafe7\u3a62\u965f\u3504\ud523(\u59ec\u97b7\u8640\u5d20\uc2e8::\u12cb\uafe7\u97e6\u12b2\ua6bd\u647c, this:\u59ec\u97b7\u8640\u5d20\uc2e8)
                invokestatic:long(\uafe7\u3a62\u965f\u3504\ud523::\u527a\u156b\u1187\u8389\u4c2b\u9033, var_9_DF:\uafe7\u3a62\u965f\u3504\ud523, div:long(add:long(mul:long(invokestatic:long(\uafe7\u3a62\u965f\u3504\ud523::\u8c8a\u3d4b\uc229\u600f\u6198\ub70c, var_9_DF:\uafe7\u3a62\u965f\u3504\ud523), ldc:long(49L)), var_7_D9:long), ldc:long(50L)))
                invokestatic:long(\uafe7\u3a62\u965f\u3504\ud523::\u416d\u8709\ub19c\u8d98\u516c\ubff1, var_9_DF:\uafe7\u3a62\u965f\u3504\ud523, ldc:long(1L))
                
                if (getfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, this:\u59ec\u97b7\u8640\u5d20\uc2e8)) {
                    if (cmpgt:boolean(var_7_D9:long, getstatic:long(\u59ec\u97b7\u8640\u5d20\uc2e8::\u71ae\u516c\u7330\u59ec\u5245\ud171))) {
                        stack_1BD_0 = getstatic:Logger(\u59ec\u97b7\u8640\u5d20\uc2e8::\u36d3\uc4d2\u3504\u183a\uf94d\u6bb9)
                        stack_1BD_1 = loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), xor:int(ldc:int(16456), ldc:int(16450)))
                        expr_19B = newarray:Supplier[](org.apache.logging.log4j.util.Supplier.class, xor:int(ldc:int(4627), ldc:int(4625)))
                        storeelement:Supplier(expr_19B:Supplier[], and:int(ldc:int(29572), ldc:int(-29573)), invokedynamic:Supplier(get:(L\u56bd\u8413\u647c\u5bc4\ud158/\u59ec\u97b7\u8640\u5d20\uc2e8;)Lorg/apache/logging/log4j/util/Supplier;, this:\u59ec\u97b7\u8640\u5d20\uc2e8))
                        storeelement:Supplier(expr_19B:Supplier[], and:int(ldc:int(23009), ldc:int(7)), invokedynamic:Supplier(get:(J)Lorg/apache/logging/log4j/util/Supplier;, var_7_D9:long))
                        invokeinterface:void(Logger::warn, stack_1BD_0:Logger, stack_1BD_1:String, expr_19B:Supplier[])
                    }
                }
                
                var_1_10A = and:int(var_1_99:int, ldc:int(-1078337889))
                
                if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<String>(\u59ec\u97b7\u8640\u5d20\uc2e8::\u3bc9\ud523\ub83f\u3a62\u12cb\u965f, this:\u59ec\u97b7\u8640\u5d20\uc2e8)))) {
                    var_1_10A = and:int(var_1_10A:int, ldc:int(467785405))
                    stack_1D4_1 = checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, getfield:List<String>(\u59ec\u97b7\u8640\u5d20\uc2e8::\u3bc9\ud523\ub83f\u3a62\u12cb\u965f, this:\u59ec\u97b7\u8640\u5d20\uc2e8), sub:int(invokeinterface:int(List<E>::size, getfield:List<String>(\u59ec\u97b7\u8640\u5d20\uc2e8::\u3bc9\ud523\ub83f\u3a62\u12cb\u965f, this:\u59ec\u97b7\u8640\u5d20\uc2e8)), and:int(ldc:int(15111), ldc:int(1121)))))
                }
                else {
                    stack_1D4_1 = loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), and:int(ldc:int(4908), ldc:int(-4909)))
                }
                
                putfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8, stack_1D4_1:String)
                putfield:\uafe7\u3a62\u965f\u3504\ud523(\u59ec\u97b7\u8640\u5d20\uc2e8::\u7e3f\u7c6b\ud217\u8258\ud7e8\u7d52, this:\u59ec\u97b7\u8640\u5d20\uc2e8, aconstnull:\uafe7\u3a62\u965f\u3504\ud523())
            }
            else {
                invokeinterface:void(Logger::error, getstatic:Logger(\u59ec\u97b7\u8640\u5d20\uc2e8::\u36d3\uc4d2\u3504\u183a\uf94d\u6bb9), loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), and:int(ldc:int(4110), ldc:int(1352))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3d4b\u64f2\u7d52\u3d4b\ua3b4\u385b(java.lang.String p0) {
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
            
            if (getfield:boolean(\u59ec\u97b7\u8640\u5d20\uc2e8::\ubff1\u5140\u965f\ub1b9\u6ec6\u960f, this:\u59ec\u97b7\u8640\u5d20\uc2e8)) {
                if (cmpeq:boolean(invokevirtual:int(String::hashCode, p0:String), getstatic:int(\u59ec\u97b7\u8640\u5d20\uc2e8::\u72f1\ube23\uceb8\ud36e\u69d9\u3711))) {
                    if (invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), xor:int(ldc:int(17410), ldc:int(17417))))) {
                        invokevirtual:void(\u92ff\ube23\u3bc9\uc238\u47c2\u8350::\u3dd3\u1833\u759a\u47c2\uc2bd\uc246, getstatic:\u92ff\ube23\u3bc9\uc238\u47c2\u8350(\uae87\ubded\ud51e\u4f52\u6c56\ua61f::\u16f6\u3c25\u4179\u12cb\u3e75\uceb8))
                    }
                }
            }
            
            invokevirtual:void(\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, this:\u59ec\u97b7\u8640\u5d20\uc2e8)
            invokevirtual:void(\u59ec\u97b7\u8640\u5d20\uc2e8::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, this:\u59ec\u97b7\u8640\u5d20\uc2e8, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3d4b\u64f2\u7d52\u3d4b\ua3b4\u385b(java.util.function.Supplier<java.lang.String> p0) {
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
            invokevirtual:void(\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, this:\u59ec\u97b7\u8640\u5d20\uc2e8)
            invokevirtual:void(\u59ec\u97b7\u8640\u5d20\uc2e8::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, this:\u59ec\u97b7\u8640\u5d20\uc2e8, p0:Supplier<String>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uafe7\u3a62\u965f\u3504\ud523 \u12cb\uafe7\u97e6\u12b2\ua6bd\u647c() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \ud51e\u8413\u51b2\u72f1\uc84e\u6198(java.lang.String p0) {
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
            invokevirtual:long(Object2LongOpenHashMap::addTo, invokestatic:Object2LongOpenHashMap(\uafe7\u3a62\u965f\u3504\ud523::\u0a06\u7330\ud12e\ucef1\u6c52\u1833, invokespecial:\uafe7\u3a62\u965f\u3504\ud523(\u59ec\u97b7\u8640\u5d20\uc2e8::\u12cb\uafe7\u97e6\u12b2\ua6bd\u647c, this:\u59ec\u97b7\u8640\u5d20\uc2e8)), p0:String[expected:Object], ldc:long(1L))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\ucef1\u600f\u3d4b\ufcaf\u76bc(java.util.function.Supplier<java.lang.String> p0) {
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
            invokevirtual:long(Object2LongOpenHashMap::addTo, invokestatic:Object2LongOpenHashMap(\uafe7\u3a62\u965f\u3504\ud523::\u0a06\u7330\ud12e\ucef1\u6c52\u1833, invokespecial:\uafe7\u3a62\u965f\u3504\ud523(\u59ec\u97b7\u8640\u5d20\uc2e8::\u12cb\uafe7\u97e6\u12b2\ua6bd\u647c, this:\u59ec\u97b7\u8640\u5d20\uc2e8)), invokeinterface:String[expected:Object](Supplier<String>::get, p0:Supplier<String>), ldc:long(1L))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u4179\u416d\uc910\u8d98 \ub18d\u3dd3\u8d90\u3d4b\u3776\u6c52() {
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
            return:\u4492\u4179\u416d\uc910\u8d98(initobject:\ud171\u4c04\uc87f\ub70c\u3bd6[expected:\u4492\u4179\u416d\uc910\u8d98](\ud171\u4c04\uc87f\ub70c\u3bd6::<init>, getfield:Map<String, \uafe7\u3a62\u965f\u3504\ud523>(\u59ec\u97b7\u8640\u5d20\uc2e8::\u5f50\u16f6\u6d99\u52d3\u647c\ua6bd, this:\u59ec\u97b7\u8640\u5d20\uc2e8), getfield:long(\u59ec\u97b7\u8640\u5d20\uc2e8::\uc910\u960f\u92ee\u8c8a\u71ae\u3c25, this:\u59ec\u97b7\u8640\u5d20\uc2e8), getfield:int(\u59ec\u97b7\u8640\u5d20\uc2e8::\ua068\u392e\u3d64\u5db4\uc87f\u4c04, this:\u59ec\u97b7\u8640\u5d20\uc2e8), invokeinterface:long(LongSupplier::getAsLong, getfield:LongSupplier(\u59ec\u97b7\u8640\u5d20\uc2e8::\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9, this:\u59ec\u97b7\u8640\u5d20\uc2e8)), invokeinterface:int(IntSupplier::getAsInt, getfield:IntSupplier(\u59ec\u97b7\u8640\u5d20\uc2e8::\u120d\u446c\uff55\u3d64\u494c\u69d9, this:\u59ec\u97b7\u8640\u5d20\uc2e8))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uafe7\u3a62\u965f\u3504\ud523 lambda$\uc84e\uc2bd\uc2bd\u927d\ud171\u3c25$3(java.lang.String p0) {
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
            return:\uafe7\u3a62\u965f\u3504\ud523(initobject:\uafe7\u3a62\u965f\u3504\ud523(\uafe7\u3a62\u965f\u3504\ud523::<init>, aconstnull:\ud523\u7c6b\u9af2\u416d\uc31c()))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Object lambda$\u6198\uc7fe\u71f1\u7bad\ud36e\u4ab3$2(long p0) {
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
            return:Object(invokestatic:Double[expected:Object](Double::valueOf, div:double(l2d:double(p0:long), ldc:double(1000000.0))))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.Object lambda$\uafe7\u8c8a\u527a\u72f1\u8cae\u7043$1() {
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
            return:Object(invokestatic:String[expected:Object](\u4492\u4179\u416d\uc910\u8d98::\ub1b9\u8258\uc31c\u8d98\ub113\u7af6, getfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8)))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.Object lambda$\ud4fe\u92ee\u9033\u71ae\u92ff\uf94d$0() {
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
            return:Object(invokestatic:String[expected:Object](\u4492\u4179\u416d\uc910\u8d98::\ub1b9\u8258\uc31c\u8d98\ub113\u7af6, getfield:String(\u59ec\u97b7\u8640\u5d20\uc2e8::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u59ec\u97b7\u8640\u5d20\uc2e8)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_3DD : int
        expr_6E : int [generated]
        stack_AD_0 : byte[] [generated]
        stack_AF_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_E8_0 : byte[] [generated]
        stack_115_0 : byte[] [generated]
        stack_117_0 : byte[] [generated]
        stack_155_0 : byte[] [generated]
        stack_34B_0 : byte[] [generated]
        stack_389_0 : byte[] [generated]
        stack_3F0_0 : byte[] [generated]
        stack_465_0 : byte[] [generated]
        var_4_324 : int
        var_3_329 : byte[]
        var_5_32A : int
        var_0_338 : int
        var_0_3E6 : int
        expr_3F0 : byte [generated]
        stack_430_2 : byte [generated]
        stack_40D_0 : byte [generated]
        var_2_AD : byte[]
        expr_B1 : int [generated]
        var_3_377 : byte[]
        var_5_378 : int
        expr_E8 : int [generated]
        expr_117 : int [generated]
        var_3_453 : byte[]
        var_5_454 : int
        expr_465 : byte [generated]
        var_3_161 : String
        stack_2BD_0 : String[] [generated]
        expr_173 : String[] [generated]
        
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
        var_0_3DD = and:int(ldc:int(1602742369), ldc:int(1336932148))
        expr_6E = arraylength:int(stack_AD_0 = stack_AF_0 = stack_E6_0 = stack_E8_0 = stack_115_0 = stack_117_0 = stack_155_0 = stack_34B_0 = stack_389_0 = stack_3F0_0 = stack_465_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("GevQrbQcFCgLtvegmCvQJaIACBnGmjIYkT/CJaIACBnGocwy+5x2GCG1lqu6h7c6DVIyDhiCfqIfpUs8Kiz6fcXALVIUZDIGDDScRF+nk3nr0K3FtiGUkIQnxiIiMAIxOBQlogAIGcaaMhiRP8IlogAIGcahzDL7nHYYIbWWq7qHtzoNUjIOGIJ+oh+lSzwqLPp9xcAtUhRkMgYMNJxK/UWjf8AIGcahzDL7nIQiI8eUJCYerCAeB5Ywop6iH6VLPCos+n3FwC1SFGQyBgw0nEr9RaN/wAgZxqHMMvuchCIjx5QkJh6t0cQNUjIOGIJ+oh+lSzwqLPp8FBopjComLDScSv1Fo3/ACBnGocwy+5x8HiInljCYFDATsbQgr7bzwZSFuvu0FgnC+au+ic4mMUoKFIR30hefpgImLB+8PLCiK6YwLo6F8ac3qdu0/iwU+qHRs8GWfhwB0c5UGgWP4hwiLvad0Je9pP+gCCqb0iQUJPQWI6qyoqm5RiIiMAGbnJAvw7OjtIIVxHekJm08MBG4e8AcsT4PtBb2KvQn0iAUIhAWH06rviwHliSupGgNN6nbtP4sFPqh0bPBpIx6giWblBPSGcQidFAjpaeyLCIyEg3MFBQUObQWMXwcFiYSDc/OMb4SB8wKJhxGWmpU")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_324 = expr_6E:int
        var_3_329 = newarray:byte[](byte.class, expr_6E:int)
        var_5_32A = expr_6E:int
        Label_0812:
        
        while (cmpeq:boolean(and:int(var_0_3DD:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_3DD = and:int(var_0_3DD:int, ldc:int(2107037746))
            var_5_32A = add:int(var_5_32A:int, ldc:int(-1))
            storeelement:byte(var_3_329:byte[], var_5_32A:int, xor:byte(add:byte(loadelement:byte(stack_34B_0:byte[], var_5_32A:int), ldc:byte(13)), ldc:byte(33)))
            
            if (cmpne:boolean(var_5_32A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_E6_0 = stack_E8_0 = stack_115_0 = stack_117_0 = stack_155_0 = stack_34B_0 = stack_389_0 = stack_3F0_0 = stack_465_0 = var_3_329:byte[]
            goto(Label_0115)
        }
        
        var_0_338 = and:int(var_0_3DD:int, ldc:int(1218057720))
        Label_0976:
        
        while (cmpne:boolean(and:int(var_0_338:int, ldc:int(32768)), ldc:int(0))) {
            var_0_3E6 = and:int(var_0_338:int, ldc:int(-1084501196))
            var_5_32A = add:int(var_5_32A:int, ldc:int(-1))
            expr_3F0 = stack_430_2 = loadelement(stack_3F0_0, var_5_32A)
            
            if (cmplt:boolean(add:int(add:int(var_5_32A:int, ldc:int(4)), neg:int(var_4_324:int)), ldc:int(0))) {
                stack_430_2 = stack_40D_0 = add:byte(expr_3F0:byte, loadelement:byte(var_3_329:byte[], add:int(var_5_32A:int, ldc:int(4))))
                goto(Label_1053)
            }
            
            Label_1021:
            
            if (cmpne:boolean(and:int(var_0_3E6:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_3E6 = and:int(var_0_3E6:int, ldc:int(1034943909))
                stack_430_2 = stack_40D_0 = add:byte(expr_3F0:byte, ldc:byte(4))
            }
            
            Label_1053:
            
            if (cmpeq:boolean(and:int(var_0_3E6:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_1021)
            }
            
            var_0_338 = and:int(var_0_3E6:int, ldc:int(228783648))
            storeelement:byte(var_3_329:byte[], var_5_32A:int, stack_430_2:byte)
            
            if (cmpne:boolean(var_5_32A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_E6_0 = stack_E8_0 = stack_115_0 = stack_117_0 = stack_155_0 = stack_34B_0 = stack_389_0 = stack_3F0_0 = stack_465_0 = var_3_329:byte[]
            goto(Label_0237)
        }
        
        var_0_3DD = and:int(var_0_338:int, ldc:int(1512369229))
        goto(Label_0812)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_3DD:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_338 = and:int(var_0_3DD:int, ldc:int(-1127353584))
            goto(Label_0284)
        }
        
        if (cmpne:boolean(and:int(var_0_3DD:int, ldc:int(1024)), ldc:int(0))) {
            var_0_338 = and:int(var_0_3DD:int, ldc:int(3862352))
            goto(Label_0237)
        }
        
        if (cmpeq:boolean(and:int(var_0_3DD:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_338 = and:int(var_0_3DD:int, ldc:int(-453177057))
        }
        else {
            var_0_338 = and:int(var_0_3DD:int, ldc:int(-1078294595))
            var_2_AD = stack_AD_0:byte[]
            expr_B1 = add:int(arraylength:int(stack_AF_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B1:int, ldc:int(0))) {
                var_3_377 = newarray:byte[](byte.class, expr_B1:int)
                var_5_378 = expr_B1:int
                
                loop {
                    var_0_338 = and:int(var_0_338:int, ldc:int(790291630))
                    var_5_378 = add:int(var_5_378:int, ldc:int(-1))
                    storeelement:byte(var_3_377:byte[], var_5_378:int, add:int(shl:int(loadelement:byte(stack_389_0:byte[], var_5_378:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_AD:byte[], add:int(var_5_378:int, and:int(ldc:int(2121), ldc:int(8209)))), ldc:int(5)), xor:int(ldc:int(27), ldc:int(28)))))
                    
                    if (cmpne:boolean(var_5_378:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_E6_0 = stack_E8_0 = stack_115_0 = stack_117_0 = stack_155_0 = stack_34B_0 = stack_389_0 = stack_3F0_0 = stack_465_0 = var_3_377:byte[]
            }
        }
        
        Label_0182:
        
        if (cmpne:boolean(and:int(var_0_338:int, ldc:int(16)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(-1533274540))
            goto(Label_0284)
        }
        
        if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_338:int, ldc:int(1024)), ldc:int(0))) {
                var_0_3DD = and:int(var_0_338:int, ldc:int(132777711))
                goto(Label_0115)
            }
            
            var_0_338 = and:int(var_0_338:int, ldc:int(794474403))
            expr_E8 = arraylength:int(stack_E8_0:byte[])
            
            if (cmpne:boolean(expr_E8:int, ldc:int(0))) {
                var_4_324 = expr_E8:int
                var_3_329 = newarray:byte[](byte.class, expr_E8:int)
                var_5_32A = expr_E8:int
                goto(Label_0976)
            }
        }
        
        Label_0237:
        
        if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0182)
            }
            
            if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(32)), ldc:int(0))) {
                var_0_3DD = and:int(var_0_338:int, ldc:int(1078388613))
                goto(Label_0115)
            }
            
            var_0_338 = and:int(var_0_338:int, ldc:int(-1108681475))
            expr_117 = arraylength:int(stack_117_0:byte[])
            
            if (cmpne:boolean(expr_117:int, ldc:int(0))) {
                var_3_453 = newarray:byte[](byte.class, expr_117:int)
                var_5_454 = expr_117:int
                
                loop {
                    var_0_338 = and:int(var_0_338:int, ldc:int(793412970))
                    var_5_454 = add:int(var_5_454:int, ldc:int(-1))
                    expr_465 = loadelement:byte(stack_465_0:byte[], var_5_454:int)
                    storeelement:byte(var_3_453:byte[], var_5_454:int, or:int(and:int(shl:int(expr_465:byte, xor:int(ldc:int(4104), ldc:int(4108))), ldc:int(-16)), and:int(shr:int(expr_465:byte[expected:int], and:int(ldc:int(16556), ldc:int(3092))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_454:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_E6_0 = stack_E8_0 = stack_115_0 = stack_117_0 = stack_155_0 = stack_34B_0 = stack_389_0 = stack_3F0_0 = stack_465_0 = var_3_453:byte[]
            }
        }
        
        Label_0284:
        
        if (cmpeq:boolean(and:int(var_0_338:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(-2023996660))
            goto(Label_0237)
        }
        
        if (cmpne:boolean(and:int(var_0_338:int, ldc:int(4096)), ldc:int(0))) {
            var_0_338 = and:int(var_0_338:int, ldc:int(1361557543))
            goto(Label_0182)
        }
        
        if (cmpne:boolean(and:int(var_0_338:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_3DD = and:int(var_0_338:int, ldc:int(1736098078))
            goto(Label_0115)
        }
        
        var_3_161 = initobject:String(String::<init>, stack_155_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_2BD_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8220), ldc:int(16397)))
        expr_173 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(174), ldc:int(5389)))
        storeelement:String(expr_173:String[], and:int(ldc:int(21921), ldc:int(-21924)), invokevirtual:String[expected:String](String::substring, var_3_161:String, and:int(ldc:int(-16730), ldc:int(16729)), and:int(ldc:int(10355), ldc:int(-10356))))
        storeelement:String(expr_173:String[], and:int(ldc:int(460), ldc:int(16906)), invokevirtual:String[expected:String](String::substring, var_3_161:String, and:int(ldc:int(179), ldc:int(-6328)), and:int(ldc:int(17487), ldc:int(13151))))
        storeelement:String(expr_173:String[], xor:int(ldc:int(16), ldc:int(23)), invokevirtual:String[expected:String](String::substring, var_3_161:String, and:int(ldc:int(24911), ldc:int(4175)), xor:int(ldc:int(16686), ldc:int(16780))))
        storeelement:String(expr_173:String[], and:int(ldc:int(17671), ldc:int(8211)), invokevirtual:String[expected:String](String::substring, var_3_161:String, xor:int(ldc:int(4114), ldc:int(4272)), and:int(ldc:int(1524), ldc:int(4308))))
        storeelement:String(expr_173:String[], xor:int(ldc:int(-32320), ldc:int(-32319)), invokevirtual:String[expected:String](String::substring, var_3_161:String, xor:int(ldc:int(429), ldc:int(377)), and:int(ldc:int(807), ldc:int(18694))))
        storeelement:String(expr_173:String[], xor:int(ldc:int(-28597), ldc:int(-28593)), invokevirtual:String[expected:String](String::substring, var_3_161:String, xor:int(ldc:int(-32051), ldc:int(-31797)), and:int(ldc:int(2398), ldc:int(18398))))
        storeelement:String(expr_173:String[], and:int(ldc:int(666), ldc:int(30826)), invokevirtual:String[expected:String](String::substring, var_3_161:String, xor:int(ldc:int(8964), ldc:int(8794)), and:int(ldc:int(12176), ldc:int(402))))
        storeelement:String(expr_173:String[], and:int(ldc:int(8461), ldc:int(1577)), invokevirtual:String[expected:String](String::substring, var_3_161:String, and:int(ldc:int(12784), ldc:int(409)), and:int(ldc:int(1517), ldc:int(461))))
        storeelement:String(expr_173:String[], xor:int(ldc:int(569), ldc:int(571)), invokevirtual:String[expected:String](String::substring, var_3_161:String, xor:int(ldc:int(2769), ldc:int(2844)), xor:int(ldc:int(224), ldc:int(305))))
        storeelement:String(expr_173:String[], xor:int(ldc:int(4380), ldc:int(4377)), invokevirtual:String[expected:String](String::substring, var_3_161:String, xor:int(ldc:int(4256), ldc:int(4465)), xor:int(ldc:int(545), ldc:int(964))))
        storeelement:String(expr_173:String[], xor:int(ldc:int(8195), ldc:int(8200)), invokevirtual:String[expected:String](String::substring, var_3_161:String, xor:int(ldc:int(-27803), ldc:int(-28032)), and:int(ldc:int(2538), ldc:int(8683))))
        storeelement:String(expr_173:String[], xor:int(ldc:int(16), ldc:int(22)), invokevirtual:String[expected:String](String::substring, var_3_161:String, and:int(ldc:int(1515), ldc:int(510)), and:int(ldc:int(4606), ldc:int(2542))))
        putstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9, expr_173:String[])
        putstatic:long(\u59ec\u97b7\u8640\u5d20\uc2e8::\u71ae\u516c\u7330\u59ec\u5245\ud171, invokevirtual:long(Duration::toNanos, invokestatic:Duration(Duration::ofMillis, ldc:long(100L))))
        putstatic:Logger(\u59ec\u97b7\u8640\u5d20\uc2e8::\u36d3\uc4d2\u3504\u183a\uf94d\u6bb9, invokestatic:Logger(LogManager::getLogger))
        putstatic:int(\u59ec\u97b7\u8640\u5d20\uc2e8::\u3e2a\ua61f\uc31c\ua068\ud7e8\ub171, invokevirtual:int(String::hashCode, loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), and:int(ldc:int(133), ldc:int(13349)))))
        putstatic:int(\u59ec\u97b7\u8640\u5d20\uc2e8::\ubf56\u16f6\u0b8e\u946b\ud158\u759a, invokevirtual:int(String::hashCode, loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), and:int(ldc:int(1079), ldc:int(10574)))))
        putstatic:int(\u59ec\u97b7\u8640\u5d20\uc2e8::\u72f1\ube23\uceb8\ud36e\u69d9\u3711, invokevirtual:int(String::hashCode, loadelement:String(getstatic:String[](\u59ec\u97b7\u8640\u5d20\uc2e8::\u61a4\u8413\u3d4b\ud36e\u64f2\u4cd9), xor:int(ldc:int(-22523), ldc:int(-22514)))))
        putstatic:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u59ec\u97b7\u8640\u5d20\uc2e8::\uc246\ube23\uc238\u67e9\u624e\u4975, initobject:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e::<init>, ldc:Class<\u67e9\u4daf\u760c\ud217\ua6bd\ubff1>(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1.class)))
        putstatic:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u59ec\u97b7\u8640\u5d20\uc2e8::\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, initobject:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0::<init>, getstatic:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u59ec\u97b7\u8640\u5d20\uc2e8::\uc246\ube23\uc238\u67e9\u624e\u4975), ldc:Class<\u56bd\u6b0d\u3711\ub18d\u12b2>(\u494c\u4975\ua068\u0c95\uc84e.\u56bd\u6b0d\u3711\ub18d\u12b2.class)))
    }
    
    public void \u4cd9\uae5d\u4bc8\u7c6b\u3bd6\ua562(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_666 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_671 : int
        
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
        var_3_666 = and:int(ldc:int(1843713946), ldc:int(1769706655))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u59ec\u97b7\u8640\u5d20\uc2e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
            var_3_666 = and:int(var_3_666:int, ldc:int(2055208931))
            var_5_80 = and:int(ldc:int(-29056), ldc:int(16703))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18925), ldc:int(18924)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_666:int, ldc:int(-93610210))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(85), ldc:int(7425)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(18433), ldc:int(4883)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_666 = and:int(var_3_D0:int, ldc:int(1826927902))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(12299), ldc:int(1)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1502598156))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(791118180))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1467117860))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1936330201))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1218615440))
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(2120982195))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0589)
                            }
                            
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0408:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(733637176))
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(865167736))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-145852984))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1857289462))
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1109439756))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1075399985))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(1851974882))
                        var_11_E1 = and:int(ldc:int(19144), ldc:int(-20169))
                        goto(Label_1529)
                    }
                    
                    Label_0589:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1140905224))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1156466704))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(2112085618))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0694:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1813187123))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-497210846))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(914313070))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(911985501))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1868557826))
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1063156421))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(1752011915))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1413351656))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1747754832))
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1416335859))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-459642))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(7691), ldc:int(8257))
                                goto(Label_1121)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-19232771))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1543986012))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1076953413))
                            goto(Label_0841)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-271053607))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-190582802))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(2088537531))
                        var_11_E1 = and:int(ldc:int(8796), ldc:int(-8797))
                    }
                    
                    Label_1121:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-943482958))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1866985999))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1835731300))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1998100728))
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1144118836))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-303640734))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1396)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1605755438))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1889511928))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1121)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-946238567))
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(200700157))
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(614715466))
                            goto(Label_0589)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1843723978))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                            goto(Label_1529)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1396:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1719080408))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-165195256))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-184727010))
                        goto(Label_0589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-402023333))
                        loopcontinue()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(1752141246))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1529:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_671 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1540:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1968974504))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1481653179))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-92553746))
                        var_17_671 = add:int(var_16_10F:int, and:int(ldc:int(17413), ldc:int(10779)))
                        looporswitchbreak()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(-530172291))
                }
                
                var_3_666 = and:int(var_3_666:int, ldc:int(-394475714))
                
                if (cmple:boolean(var_5_80 = var_17_671:int, sub:int(var_6_87:int, xor:int(ldc:int(1124), ldc:int(1125))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
